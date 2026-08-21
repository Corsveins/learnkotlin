fun main() {

    println("Введите количество секунд:")
    val seconds = readln().toInt()
    for (i in seconds downTo 1) {
        println(i)
        Thread.sleep(1000)
    }

    println("Время вышло")
}