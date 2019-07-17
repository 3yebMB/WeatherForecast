package dev.m13d.weatherforecast.ui.weather.future.list

import androidx.lifecycle.ViewModel;
import dev.m13d.weatherforecast.data.provider.UnitProvider
import dev.m13d.weatherforecast.data.repository.ForecastRepository
import dev.m13d.weatherforecast.internal.lazyDeferred
import dev.m13d.weatherforecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel (
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
): WeatherViewModel(forecastRepository, unitProvider) {
    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
