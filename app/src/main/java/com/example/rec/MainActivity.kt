package com.example.rec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerCities : RecyclerView
    private val cities = arrayOf(
        "Hamburger",
        "Cheeseburger",
        "Sandwich",
        "Milkshake",
        "Muffin",
        "Burrito",
        "Taco",
        "Hot dog",
        "Fried chicken",
        "Donuts",
        "Soft drink",
        "Pizza",
        "Onion ring",
        "Pancake",
        "Bacon",
        "Chip",
        "Noodle",
        "Burrito",
        "Taco",
        "Hot dog",
        "Fried chicken",
        "Donuts",
        "Soft drink"



    )
    private lateinit var citiesAdapter: CitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        initViews()
    }
    private fun initViews() {
        recyclerCities = findViewById(R.id.recyclerCities)
        citiesAdapter = CitiesAdapter(cities)
        recyclerCities.adapter = citiesAdapter
        recyclerCities.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
