package com.example.myandroidgroupv3.model

import android.os.Parcelable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Add(
    @DrawableRes val icon : Int,
    @ColorRes val bgColor : Int,
    val text : String
) : Parcelable