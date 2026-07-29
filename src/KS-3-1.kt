fun main () {

    val userName = "Валерий"
    var greetingsUser = "Доброе утро"
    println("${greetingsUser + ", " + userName + "."}")

    greetingsUser = "Добрый день"
    println("${greetingsUser + ", " + userName + "."}")

    greetingsUser = "Доброй ночи"
    println("${greetingsUser + ", " + userName + "."}")
}