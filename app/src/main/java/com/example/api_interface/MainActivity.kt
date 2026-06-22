package com.example.api_interface

import android.icu.lang.UCharacter
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.api_interface.databinding.ActivityMainBinding
import okhttp3.Callback
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.Objects

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val retroFitBuilder = Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api_interface::class.java)

        val retroData = retroFitBuilder.getproductData()

        retroData.enqueue(object  : retrofit2.Callback<DATA>{

            override fun onResponse(p0: Call<DATA?>?, p1: Response<DATA?>?) {

                val responseBodyGet = p1?.body()

                val total = responseBodyGet?.total
                Toast.makeText(this@MainActivity, "Total Items : ${total}", Toast.LENGTH_SHORT).show()

                val productList = responseBodyGet?.products

                binding.recycleViewTJ.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL,false)
                binding.recycleViewTJ.adapter = MyPersonalAdapter(this@MainActivity,productList)
            }

            override fun onFailure(p0: Call<DATA?>?, p1: Throwable?) {
                Log.d("MainActivity", "onFailure: ${p1?.message}")
            }
        })

    }
}