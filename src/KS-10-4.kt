fun rollDices(): Int = (1..6).random()

fun playRound(): Boolean {
    // 1. ваш бросок — положите результат rollDice() в переменную human
    val human = rollDices()
    // 2. бросок компьютера — переменная machine
    val machine = rollDices()
    // 3. напечатайте оба результата: "Вы: ..." и "Компьютер: ..."
    println("Человек $human")
    println("Машина $machine")
    // 4. верните результат: true, если human > machine
    return human > machine
}

fun main() {
    var wins = 0          // счётчик ваших побед
    var answer: String    // объявляем ДО цикла — почему, скажу ниже

    do {
        // 1. сыграть раунд: если playRound() вернул true — увеличить wins на 1
        if (playRound()) { wins += 1 }
        // 2. напечатать: "Хотите бросить кости еще раз? Введите Да или Нет"
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        // 3. считать ответ в answer — в Kotlin строка с консоли читается так: answer = readln()
        answer = readln()
    } while (answer == "Да")

    // 4. после цикла: напечатать, сколько партий вы выиграли
    println("Количество выйгранных партий:$wins")
}