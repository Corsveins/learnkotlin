fun main() {

    println("Введите количество секунд:")
    var inputSeconds  = readln().toInt()


    do {
        println("Осталось секунд: $inputSeconds")
        inputSeconds--
        Thread.sleep(1000)
    } while (inputSeconds > 0)

    println("Время вышло")
}