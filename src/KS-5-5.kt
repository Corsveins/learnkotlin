import kotlin.random.Random

fun main() {

    val listOne = listOf(Random.nextInt(43), Random.nextInt(43),Random.nextInt(43))

    println("Введите первое число:")
    println("Введите второе число:")
    println("Введите третье число:")

    val userNumbers = listOf(
        readln().toInt(),
        readln().toInt(),
        readln().toInt())

    val comparison = listOne.intersect(userNumbers).size

    when(comparison) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали 2 числа и получите крупный приз")
        1 -> println("Вы угадали 1 число и получите утешительный приз")
       else -> {
           println("Вы не угадали ни одного числа")
       }
    }
    println("Правильные числа: $listOne")
}

