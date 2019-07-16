package dev.m13d.weatherforecast.data.network

import androidx.lifecycle.LiveData
import dev.m13d.weatherforecast.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}