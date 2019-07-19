package dev.m13d.weatherforecast.ui.weather.future.list

import android.annotation.SuppressLint
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import dev.m13d.weatherforecast.R
import dev.m13d.weatherforecast.data.db.unitlocalized.future.list.MetricSimpleFutureWeatherEntry
import dev.m13d.weatherforecast.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import dev.m13d.weatherforecast.internal.glide.GlideApp
import kotlinx.android.synthetic.main.item_future_weather.*
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.format.FormatStyle

class FutureWeatherItem(
    val weatherEnty: UnitSpecificSimpleFutureWeatherEntry
) : Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.apply {
            textView_condition.text = weatherEnty.conditionText
            updateDate()
            updateTemperature()
            updateConditionImage()
        }
    }

    override fun getLayout() = R.layout.item_future_weather

    private fun ViewHolder.updateDate() {
        val dtFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
        textView_date.text = weatherEnty.date.format(dtFormatter)
    }

    @SuppressLint("SetTextI18n")
    private fun ViewHolder.updateTemperature() {
        val unitAbbreviation = if (weatherEnty is MetricSimpleFutureWeatherEntry) "°C" else "°F"
        textView_temperature.text = "${weatherEnty.avgTemperature}$unitAbbreviation"
    }

    private fun ViewHolder.updateConditionImage() {
        GlideApp.with(this.containerView)
            .load("https:"+weatherEnty.conditionIconUrl)
            .into(imageView_condition_icon)
    }
}