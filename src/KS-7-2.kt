import kotlin.random.Random
import kotlin.random.nextInt

fun main (){

    var code: Int
    var userInput: Int

    do {
        code = Random.nextInt(1000..9999)
        println("Ваш код авторизации: $code")
        println("Введите код авторизации:")
        userInput = readln().toInt()

        if (userInput != code) {
            println("код введён неверно")
        }
    } while (userInput != code)

    println("Авторизация прошла успешно!")

}