fun main() {
    /*
    Создай программу, которая генерирует более сложные пароли.
    пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
    цифры и буквы должны располагаться в случайном порядке;
    длина пароля должна задаваться пользователем;
    минимальная длина пароля 6 символов.
     */

    // Шаг 1 Создать диапазоны
    val dictionaryNumber = '0'..'9'
    val dictionaryUpper = 'A'..'Z'
    val dictionaryLower = 'a'..'z'

    // Шаг 1.2 Запрос длины пароля
    println("Введите длину пароля")
    val inputLen = readln().toInt()


    // Шаг 2 проверка длины пароля
    val length = if (inputLen < 6) 6 else inputLen


    // Шаг 3 Собрать все наборы в один список
    val allList =  dictionaryNumber.toList() + dictionaryUpper.toList() + dictionaryLower.toList()
    var password = ""
    password += dictionaryNumber.random()
    password += dictionaryUpper.random()
    password += dictionaryLower.random()
    // Шаг 4 Перебрать список:


        for (i in 3 until length) {
            password += allList.random()
        }
        password = password.toList().shuffled().joinToString("")

    println( password)
}