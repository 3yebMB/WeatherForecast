package dev.m13d.weatherforecast.data.provider

import dev.m13d.weatherforecast.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}