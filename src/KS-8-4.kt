fun main() {

    // Cоздай массив со списком ингредиентов и напечатай его в консоль;
    val ingriends = arrayOf("Мука","Яйца","Зелень")
    println(ingriends.joinToString())
    // запроси у пользователя информацию об ингредиенте, который он хочет заменить;
    println("Введите элемент который котите заменить")
    val userInput = readln()
    val index =  ingriends.indexOf(userInput)
    // если есть, запроси ингредиент, который пользователь хотел бы добавить;
    if (index != -1) {
        println("Введите элемент для замены")
        val newUserInput = readln()
        ingriends[index] = newUserInput
        println("Готово! Вы сохранили следующий список: ${ingriends.joinToString()}")
    } else {
        println("Элемента $userInput нет в списке")
    }

    
}