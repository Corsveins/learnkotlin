fun main() {

    println("Введите количество секунд:")
    val countSeconds = readln().toInt()
    var count = 0
    while (count <= countSeconds) {
        Thread.sleep(1000)
        count++
    }
    println("Прошло $countSeconds секундccc")
}