package dev.m13d.weatherforecast.data.network.response

import com.google.gson.annotations.SerializedName
import dev.m13d.weatherforecast.data.db.entity.CurrentWeatherEntry
import dev.m13d.weatherforecast.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)