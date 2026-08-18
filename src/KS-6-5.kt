import kotlin.random.Random
import kotlin.random.nextInt
fun main() {


    var countAttepts = 3
    /*
    * Доработка задачи на авторизацию. Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь должен доказать,
    * что он не бот. Для этого программа предлагает решить простой математический пример – сложить два числа.
    * Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
    * */
    while (countAttepts > 0){
        val randomNumber = Random.nextInt(1..9)
        val randomTwo = Random.nextInt(1..9)
        val allResult = randomNumber + randomTwo
        println("Решите пример: $randomNumber + $randomTwo =  ")
        val userInput = readln().toInt()
        if (userInput == allResult){
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно повторите попытку!")
        }
        countAttepts--
    }
    println("Доступ запрещен")
}