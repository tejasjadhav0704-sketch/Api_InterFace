package com.example.api_interface

import retrofit2.Call
import retrofit2.http.GET

interface api_interface {
    @GET("products")
    fun getproductData() : Call<DATA>
}