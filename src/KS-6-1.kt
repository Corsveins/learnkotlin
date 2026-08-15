fun main() {

    // Задаем логин
    println("Задайте логин:")
    val userLoginCreat = readln()
    // Задаем пароль
    println("Задайте пароль:")
    val userPasswordCreat = readln()

    // Введите пароль
    println("Введите логин:")
    var userInputLogin = readln()
    println("Введите пароль:")
    var userInputPassword = readln()


    while (userLoginCreat != userInputLogin || userPasswordCreat != userInputPassword) {
        println("Логин или пароль введен не верно повторите попытку")
        println("Введите логин:")
        var userInputLogin = readln()
        println("Введите пароль:")
        var userInputPassword = readln()
    }
    println("Авторизация прошла успешно")
}