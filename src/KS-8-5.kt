fun main() {
    println("Введите количество ингредиентов:")
    val userInput = readln().toInt()
    val arr = Array(userInput) {
        readln()
    }
    println(arr.joinToString(","))
}