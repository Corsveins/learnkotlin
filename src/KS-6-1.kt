fun main() {

    println("Задайте логин:")
    val login = readln()
    println("Задайте пароль:")
    val password = readln()

    println("Введите логин:")
    var inputLogin = readln()
    println("Введите пароль:")
    var inputPassword = readln()

    while (login != inputLogin || password != inputPassword) {
        println("Неверный логин ил пароль повторите попытку")

        println("Введите логин:")
        inputLogin = readln()

        println("Введите пароль:")
        inputPassword = readln()
    }
    println("Авторизация прошла успешно")
}