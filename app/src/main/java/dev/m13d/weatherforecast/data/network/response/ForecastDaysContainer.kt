package dev.m13d.weatherforecast.data.network.response


import com.google.gson.annotations.SerializedName

data class Forecast(
    val forecastday: List<Forecastday>
)