package com.autentia.agappe.agappeback

import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
class MealController {

    val allMeals = mutableListOf(
        Meal("César Alberca", "Tortitas", "2017-4-15", 5),
        Meal("Javier Sánchez", "Ibéricos cacereños", "2017-8-7", 4)
    )

    @GetMapping("/meals")
    fun getMeals() = allMeals

    @PostMapping("/meals")
    fun createMeal(@RequestBody meal: Meal) {
        allMeals.add(meal)
    }

}