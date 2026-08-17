fun main() {

    println("Введите количество секунд:")
    var inputSeconds  = readln().toInt()


    do {
        println("Осталось секунд: $inputSeconds")
        inputSeconds--
    } while (inputSeconds > 0)

    println("Время вышло")
}