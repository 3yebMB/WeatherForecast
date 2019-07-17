package dev.m13d.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import dev.m13d.weatherforecast.data.db.entity.WeatherLocation
import dev.m13d.weatherforecast.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import dev.m13d.weatherforecast.data.db.unitlocalized.future.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}