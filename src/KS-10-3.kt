fun main() {


    println("Введите длину пароля:")
    val userLen = readln().toInt()

    println(generatePassword(userLen))
}


fun generatePassword(len: Int): String {

    val numberList = "0123456789"
    val specalCharter = "!\"#\$%&'()*+,-./ "
    var password = ""
    for (i in 1 .. len) {
        if(i % 2 == 1) {
            password += numberList.random()
        } else {
            password += specalCharter.random()
        }
    }
    return password
}