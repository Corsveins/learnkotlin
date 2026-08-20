import kotlin.random.Random

fun main() {

    val stringOne = "123456"
    val stringTwo = "whartu"


    var password = ""
    for (i in 1.. 6) {
        if (i % 2 == 0) {
            password = password + stringOne[Random.nextInt(stringOne.length)]
        } else {
            password = password + stringTwo[Random.nextInt(stringTwo.length)]
        }
    }
    println(password)
}