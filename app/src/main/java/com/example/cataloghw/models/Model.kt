package com.example.cataloghw.models

import com.example.cataloghw.fragments.DetailFragment
import java.io.Serializable

data class Model(
    val image:String,
    val name:String,
    val description:String,
    val detailDescription: String
): Serializable

