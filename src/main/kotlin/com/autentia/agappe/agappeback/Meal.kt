package com.autentia.agappe.agappeback

import com.fasterxml.jackson.annotation.JsonCreator
import java.util.*

data class Meal(
    val author: String,
    val name: String,
    val date: Date,
    val score: Int
)

data class NewMeal @JsonCreator constructor(
    val author: String,
    val name: String,
    val date: Date,
    val score: Int
)