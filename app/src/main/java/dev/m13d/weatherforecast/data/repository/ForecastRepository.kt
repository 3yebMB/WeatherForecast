package dev.m13d.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import dev.m13d.weatherforecast.data.db.entity.WeatherLocation
import dev.m13d.weatherforecast.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}