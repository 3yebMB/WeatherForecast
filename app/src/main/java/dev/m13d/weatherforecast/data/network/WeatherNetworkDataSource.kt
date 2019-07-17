package dev.m13d.weatherforecast.data.network

import androidx.lifecycle.LiveData
import dev.m13d.weatherforecast.data.network.response.CurrentWeatherResponse
import dev.m13d.weatherforecast.data.network.response.FutureWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )
}