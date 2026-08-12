fun main() {

    println("Введите логин:")
    println("Введите пароль:")

    val adminUser = "Zaphod"
    val adminPassword = "PanGalactic"

    val login = readln()
    val password = readln()

    when{
        adminUser != login -> println("Пользователь не найден!.Пройдите регистрацию ")
        password != adminPassword -> println("Пароль не верный!")
        else -> println("""
            Вздыхает... Ваши данные проверены, и о, чудо, они верны... Пользователь "Zaphod", вам 
            разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, войдите... 
            Если вам так уж надо, в конце концов... Меланхолический вздох. Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent())
    }
}