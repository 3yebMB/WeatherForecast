package dev.m13d.weatherforecast.ui.weather.future.detail

import dev.m13d.weatherforecast.data.provider.UnitProvider
import dev.m13d.weatherforecast.data.repository.ForecastRepository
import dev.m13d.weatherforecast.internal.lazyDeferred
import dev.m13d.weatherforecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {
    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
