fun main() {

    val oneNumber = 3
    val twoNumber = 6
    val validResult = oneNumber + twoNumber

    println("Введите результат сложения чисел $oneNumber + $twoNumber = ")
    val userInput = readln().toIntOrNull()
    if (validResult == userInput) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}