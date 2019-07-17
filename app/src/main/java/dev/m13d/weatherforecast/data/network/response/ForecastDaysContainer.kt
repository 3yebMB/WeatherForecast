package dev.m13d.weatherforecast.data.network.response


import dev.m13d.weatherforecast.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    val entries: List<FutureWeatherEntry>
)