package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to NewsNow",
        description = "The only platform to access all the latest news at your fingertips.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Explore Latest News Topics",
        description = "Discover a wide range of news articles tailored to your interests.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "News Bookmarking Made Easy",
        description = "Easily save and organize your favorite news articles for convenient reading later.",
        image = R.drawable.onboarding3
    )
)