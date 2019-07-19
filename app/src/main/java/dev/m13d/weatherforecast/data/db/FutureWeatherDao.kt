package dev.m13d.weatherforecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.m13d.weatherforecast.data.db.entity.FutureWeatherEntry
import dev.m13d.weatherforecast.data.db.unitlocalized.future.detail.ImperialDetailFutureWeatherEntry
import dev.m13d.weatherforecast.data.db.unitlocalized.future.detail.MetricDetailFutureWeatherEntry
import dev.m13d.weatherforecast.data.db.unitlocalized.future.list.ImperialSimpleFutureWeatherEntry
import dev.m13d.weatherforecast.data.db.unitlocalized.future.list.MetricSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate

@Dao
interface FutureWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(futureWeatherEntries: List<FutureWeatherEntry>)

    @Query("SELECT * FROM future_weather WHERE date(date) >= date(:startDate)")
    fun getSimpleWeatherForecastMetric(startDate: LocalDate): LiveData<List<MetricSimpleFutureWeatherEntry>>

    @Query("SELECT * FROM future_weather WHERE date(date) >= date(:startDate)")
    fun getSimpleWeatherForecastImperial(startDate: LocalDate): LiveData<List<ImperialSimpleFutureWeatherEntry>>

    @Query("SELECT * FROM future_weather WHERE date(date) = date(:date)")
    fun getDetailWeatherByDateMetric(date: LocalDate): LiveData<MetricDetailFutureWeatherEntry>

    @Query("SELECT * FROM future_weather WHERE date(date) = date(:date)")
    fun getDetailWeatherByDateImperial(date: LocalDate): LiveData<ImperialDetailFutureWeatherEntry>

    @Query("SELECT count(id) FROM future_weather WHERE date(date) >= date(:startDate)")
    fun countFutureWeather(startDate: LocalDate): Int

    @Query("DELETE FROM future_weather WHERE date(date) < date(:firstDateToKeep)")
    fun deleteOldEntries(firstDateToKeep: LocalDate)
}