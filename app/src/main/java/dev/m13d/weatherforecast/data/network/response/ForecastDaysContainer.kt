package dev.m13d.weatherforecast.data.network.response

import com.google.gson.annotations.SerializedName
import dev.m13d.weatherforecast.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)