package com.autentia.agappe.agappeback

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class MealController {

    val allMeals = mutableListOf(
        Meal("César Alberca", "Tortitas", Date(), 5),
        Meal("Javier Sánchez", "Embutido", Date(), 5)
    )

    @GetMapping("/meals")
    fun getMeals() = allMeals

    @PostMapping("/meals")
    fun createMeal(@RequestBody meal: Meal) {
        allMeals.add(meal)
    }

}