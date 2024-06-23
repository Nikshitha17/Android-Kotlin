package com.nikapps.imagegallery.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("images")
    suspend fun fetchImages(): List<ImageResponse>
}

object RetrofitInstance {
    private const val BASE_URL = "https://api.unsplash.com/"

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
