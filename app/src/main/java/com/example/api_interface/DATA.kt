package com.example.api_interface

data class DATA(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)