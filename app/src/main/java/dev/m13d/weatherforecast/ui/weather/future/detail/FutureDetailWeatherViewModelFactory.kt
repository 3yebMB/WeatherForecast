package dev.m13d.weatherforecast.ui.weather.future.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.m13d.weatherforecast.data.provider.UnitProvider
import dev.m13d.weatherforecast.data.repository.ForecastRepository
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModelFactory(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FutureDetailWeatherViewModel(detailDate, forecastRepository, unitProvider) as T
    }
}