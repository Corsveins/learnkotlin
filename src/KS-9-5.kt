/*
* Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
* результат должен исключать повторы;
* список должен выводиться в алфавитном порядке;
* все элементы списка выведены в одну строку, разделяя слова запятыми;
* первый элемент должен быть распечатан с заглавной букв
*/



fun main() {
    // Шаг - 1 Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности)

    val listIngredient = mutableListOf<String>()

    repeat(5) {
        println("Введите ваши ингредиенты")
        val userIngredient = readln()
        listIngredient += userIngredient
    }

    // Шаг - 2 результат должен исключать повторы;
    val chainingList = listIngredient.distinct()
        .sorted()


    // Шаг - 3  все элементы списка выведены в одну строку, разделяя слова запятыми
    val chainingStringIngredient = chainingList.joinToString(", ")

    val chainingStringIngriChar = chainingStringIngredient.replaceFirstChar {
        it.uppercase()
    }
    print(chainingStringIngriChar)

}


