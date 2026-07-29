fun main () {

    val userName = "Валерий"
    var greetingsUser = "Добрый день"

    println("${greetingsUser + ", " + userName + "."}")

    greetingsUser = "Добрый вечер"

    println("${greetingsUser + ", " + userName + "."}")
}