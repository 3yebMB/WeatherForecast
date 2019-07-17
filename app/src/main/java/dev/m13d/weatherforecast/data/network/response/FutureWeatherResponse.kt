package dev.m13d.weatherforecast.data.network.response


import com.google.gson.annotations.SerializedName
import dev.m13d.weatherforecast.data.db.entity.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)