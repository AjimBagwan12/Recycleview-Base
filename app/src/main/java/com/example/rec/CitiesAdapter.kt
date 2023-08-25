package com.example.rec

import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CitiesAdapter(
    private val cities : Array<String>
) : RecyclerView.Adapter<CitiesAdapter.CityViewHolder>() {

    class CityViewHolder(val txtCity : TextView) : ViewHolder(txtCity)

    override fun getItemCount(): Int {
        Log.e("bit", "getItemCount")
        return cities.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        Log.e("bit", "onCreateViewHolder")

        val txtCity = TextView(parent.context)
        txtCity.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
        )
        txtCity.textSize = 20f
        txtCity.setPadding(40, 40, 20, 40)

        return CityViewHolder(txtCity)

    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        Log.e("bit", "onBindViewHolder : $position")
        holder.txtCity.text = "${cities[position]} "
    }

}
