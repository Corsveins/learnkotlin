class User2 {
    val id: Int = 12334
    val login: String = "Valera"
    var password: String = "123456"
    val email: String = "mcmakar@gmail.com"
    var bio: String = ""

    // вывод информации о пользователе в консоль;
    fun printUserInfo() {
        println("$id $login $email $bio")
    }

    //считывание из консоли текста и запись в поле bio;
    fun readConsole() {
        println("Заполните биографию")
        bio = readln()
    }

    // изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый.
    // Записать его в поле и сообщить, что пароль изменен;

    fun correctPassword() {
        println("Введите пароль:")
        while(true) {
            val userPassword = readln()
            if (userPassword == password) {
                println("Введите новый пароль:")
                val newPassword = readln()
                password = newPassword
                println("пароль изменен!")
                break
            }
        println("Повторите попытку!")
        }
    }
}

fun main() {

    val myUser = User2()
    myUser.readConsole()
    myUser.correctPassword()
    myUser.printUserInfo()



}

