package com.example.myandroidgroupv3.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val username : String,
    val password : String,
) : Parcelable {

}