fun main() {

    val correctNumberFirst = 10
    val correctNumberSecond =  25

    println("Введите первое число:")
    val userInputOne = readln().toIntOrNull()

    println("Введите второе число:")
    val userInputTwo = readln().toIntOrNull()

    if ((correctNumberFirst == userInputOne && correctNumberSecond == userInputTwo) ||
        (correctNumberFirst == userInputTwo && correctNumberSecond == userInputOne)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((correctNumberFirst == userInputOne || correctNumberSecond == userInputTwo)
        || (correctNumberFirst == userInputTwo || correctNumberSecond == userInputOne)){
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Нужные числа для победы: $correctNumberFirst и $correctNumberSecond")
}






