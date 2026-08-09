fun main() {

    println("наличие повреждений корпуса:")
    val isDamageHousing = readln().toBoolean()
    println("Текущий состав экипажа:")
    val compositionOfTheCrew = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val numberBoxesProvisions = readln().toInt()
    println("благоприятность метеоусловий:")
    val isWeatherConditions = readln().toBoolean()


    val crewNumberStart = 55
    val crewNumberEnd = 70
    val countBox = 50

    val isFavorableConditions = !isDamageHousing  && compositionOfTheCrew in crewNumberStart..crewNumberEnd && numberBoxesProvisions > countBox
    val isNotFavorableConditions = isDamageHousing  && compositionOfTheCrew == crewNumberEnd && numberBoxesProvisions >= countBox && isWeatherConditions

    val result = isFavorableConditions || isNotFavorableConditions
    println(result)
}