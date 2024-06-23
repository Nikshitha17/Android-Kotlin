package com.nikapps.imagegallery.network

data class ImageResponse(
    val id: String,
    val title: String,
    val url: String
)

data class Urls(
    val small: String,
    val full: String
)

