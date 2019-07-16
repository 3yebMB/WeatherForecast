package dev.m13d.weatherforecast.data.response


import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntry(
    val cloud: Int,
    val condition: Condition,
    @SerializedName("feelslike_c")
    val feelslikeC: Double,
    @SerializedName("feelslike_f")
    val feelslikeF: Int,
    @SerializedName("gust_kph")
    val gustKph: Int,
    @SerializedName("gust_mph")
    val gustMph: Double,
    val humidity: Int,
    @SerializedName("is_day")
    val isDay: Int,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int,
    @SerializedName("precip_in")
    val precipIn: Int,
    @SerializedName("precip_mm")
    val precipMm: Int,
    @SerializedName("pressure_in")
    val pressureIn: Double,
    @SerializedName("pressure_mb")
    val pressureMb: Int,
    @SerializedName("temp_c")
    val tempC: Int,
    @SerializedName("temp_f")
    val tempF: Int,
    val uv: Int,
    @SerializedName("vis_km")
    val visKm: Int,
    @SerializedName("vis_miles")
    val visMiles: Int,
    @SerializedName("wind_degree")
    val windDegree: Int,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("wind_kph")
    val windKph: Double,
    @SerializedName("wind_mph")
    val windMph: Double
)