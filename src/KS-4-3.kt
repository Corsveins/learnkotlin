
const val FAVORABLE_AIR_HUMIDITY: Int = 20
const val SEASON: String = "Зима"

fun main() {

    val isWeatherToday = true
    val isConditionTent = true
    val isHumidityToday = 20
    val isSeasonToday = "Зима"

    val isReferenceСonditions = (FAVORABLE_AIR_HUMIDITY == isHumidityToday && SEASON != isSeasonToday) && (isWeatherToday && isConditionTent)



    println("Благоприятные ли условия сейчас для роста бобовых? $isReferenceСonditions")
}