const val VALID_AGE = 18
fun main() {

    println("Введите год своего рождения:")
    val userYear: Int = readln().toInt()
    val todayYear = 2026
    val reserchYear = todayYear - userYear

    if (reserchYear >= VALID_AGE) {
        println("Показать экран со скрытым контентом")
    }
}