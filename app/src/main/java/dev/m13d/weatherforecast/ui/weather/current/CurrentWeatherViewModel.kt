package dev.m13d.weatherforecast.ui.weather.current

import dev.m13d.weatherforecast.data.provider.UnitProvider
import dev.m13d.weatherforecast.data.repository.ForecastRepository
import dev.m13d.weatherforecast.internal.lazyDeferred
import dev.m13d.weatherforecast.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
