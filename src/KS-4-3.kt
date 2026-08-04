
const val AIR_HUMIDITY: Int = 20
const val SEASON: String = "Зима"

fun main() {

    val weatherToday = true
    val conditionTent = true
    val humidityToday = 20

    val isReferenceСonditions = (AIR_HUMIDITY == humidityToday && SEASON != "Зима") && (weatherToday && conditionTent)



    println("Благоприятные ли условия сейчас для роста бобовых? $isReferenceСonditions")
}