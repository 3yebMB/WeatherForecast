package dev.m13d.weatherforecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import dev.m13d.weatherforecast.data.provider.UnitProvider
import dev.m13d.weatherforecast.data.repository.ForecastRepository
import dev.m13d.weatherforecast.internal.UnitSystem
import dev.m13d.weatherforecast.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}
