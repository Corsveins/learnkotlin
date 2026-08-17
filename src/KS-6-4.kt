import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var numberOfAttempts = 5
    val randomNumber = Random.nextInt(1..9)

    while (numberOfAttempts > 0) {
        println("Введите число:")
        val userInput = readln().toInt()

        when {
            userInput == randomNumber -> {
                println("Это была великолепная игра!")
                return
            } else -> {
                println("Неверно")
                numberOfAttempts--
                println("Количество попыток: $numberOfAttempts")
            }
        }
    }
    println("Было загадано число: $randomNumber")

}