fun main() {

    val adminUser = "Zaphod"
    val adminPassword = "PanGalactic"

    println("Введите логин:")
    val userLogin = readln()

    when {
        userLogin != adminUser -> println("Пользователь не существует. Пройдите регистрацию")
        else ->{
            println("Введите пароль:")
            val userPassword = readln()

            when {
                userPassword != adminPassword -> println("Пароль неправильный Повторите попытку.")
                else -> {
                    println(
                        """
                    Вздыхает... Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено 
                    входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... 
                    Если вам так уж надо, в конце концов... Меланхолический вздох. Надеюсь, вам понравится 
                    пребывание здесь больше, чем мне.
                """.trimIndent()
                    )
                }
            }
        }
    }
}