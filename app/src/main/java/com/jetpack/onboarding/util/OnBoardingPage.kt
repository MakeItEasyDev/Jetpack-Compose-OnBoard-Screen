package com.jetpack.onboarding.util

import androidx.annotation.DrawableRes
import com.jetpack.onboarding.R

sealed class OnBoardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
    object First: OnBoardingPage(
        image = R.drawable.onboard1,
        title = "Make it Easy One",
        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do elusemod tempor incididunt labore."
    )
    object Second: OnBoardingPage(
        image = R.drawable.onboard2,
        title = "Make it Easy Two",
        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do elusemod tempor incididunt labore."
    )
    object Third: OnBoardingPage(
        image = R.drawable.onboard3,
        title = "Make it Easy Three",
        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do elusemod tempor incididunt labore."
    )
}