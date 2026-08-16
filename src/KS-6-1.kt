fun main() {

    println("Задайте логин:")
    val login = readln()
    println("Задайте пароль:")
    val password = readln()

    println("Введите логин:")
    val inputLogin = readln()
    println("Введите пароль:")
    val inputPassword = readln()

    while (login != inputLogin || password != inputPassword) {
        println("Неверный логин ил пароль повторите попытку")
    }
    println("Авторизация прошла успешно")
}