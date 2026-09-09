fun main() {


    println("Введите длину пароля:")
    val userLen = readln().toInt()

    println(generatePassword(userLen))
}


fun generatePassword(len: Int): String {

    val numberString = "0123456789"
    val specialCharter = "!\"#\$%&'()*+,-./ "
    var password = ""
    for (i in 1 .. len) {
        if(i % 2 == 1) {
            password += numberString.random()
        } else {
            password += specialCharter.random()
        }
    }
    return password
}