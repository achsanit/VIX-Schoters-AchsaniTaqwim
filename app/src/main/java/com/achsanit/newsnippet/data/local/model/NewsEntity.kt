package com.achsanit.newsnippet.data.local.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsEntity(
    val publishedAt: String,
    val author: String,
    val urlToImage: String,
    val description: String,
    val source: String,
    val title: String,
    val url: String,
    val content: String
): Parcelable
