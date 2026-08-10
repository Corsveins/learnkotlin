const val AGE = 18
fun main() {

    println("Введите год своего рождения:")
    val userYear: Int = readln().toInt()
    val todayYear = 2026
    val reserchYear = todayYear - userYear

    if (reserchYear >= AGE) {
        println("Показать экран со скрытым контентом")
    }
}