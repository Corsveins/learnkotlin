class User {
    val id: Int = 12334
    var login: String = "Valera"
    var password: Int = 123456
    var email: String = "mcmakar@gmail.com"
}

fun main() {
    val userOne = User()
    val userTwo = User()

    println(userOne.login)
    println(userOne.password)
    println(userOne.email)
    println(userOne.id)

    println(userTwo.login)
    println(userTwo.password)
    println(userTwo.email)
    println(userTwo.id)


}