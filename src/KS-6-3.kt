fun main() {

    println("Введите количество секунд:")
    var inputSeconds = readln().toInt()

    while (inputSeconds > 0){
        println("Осталось секунд: $inputSeconds")
        inputSeconds--
        Thread.sleep(1000)
    }
    println("Время вышло")
}