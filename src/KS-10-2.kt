
fun validateLenLoginAndPassword(login:String, password: String): Boolean {
    return login.length < 4 || password.length < 4
}

fun main() {

    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val passwordLogin = readln()

    when {
        validateLenLoginAndPassword(userLogin, passwordLogin) -> println("Логин или пароль недостаточно длинные")
        else -> println("Логин и пароль верные")
    }
}