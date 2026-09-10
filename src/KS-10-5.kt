const val USER_LOGIN = "Valera"
const val USER_PASSWORD = "123456"
const val CHARS = "ABC1234abcdefghijklmnop"

fun generateToken(): String {
    var token = ""
    repeat(32) {
       token += CHARS.random()
    }
    return token
}


fun authorize(login:String, password:String): String? =
    if (USER_LOGIN == login && USER_PASSWORD == password) generateToken() else null

val shoppingCart: List<String> = listOf("Хлеб", "Молоко", "Сыр")

// принимает токен, возвращает список
fun getShoppingCart(token: String): List<String> {
    return shoppingCart
}

fun main() {
    val login = "Valera"
    val password = "123456"
    val token = authorize(login, password)

    if (token != null) {
        val cart = getShoppingCart(token)   // ← получить корзину
        for (item in cart) {                // ← и сразу напечатать
            println(item)
        }
    } else {
        println("Авторизация не удалась")   // ← сообщение о провале
    }
}