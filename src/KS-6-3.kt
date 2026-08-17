fun main() {

    println("Введите количество секунд:")
    val inputSeconds  = readln().toInt()
    var i = 0

    do {
        println("Осталось секунд: $i")
        i++
    } while (i <= inputSeconds)

}