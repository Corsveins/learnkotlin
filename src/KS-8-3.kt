fun main() {
    val ingredients = arrayOf("Картошка", "Свекла", "Лук")

    println("Выберите ингредиент:")
    val userInput = readln().trim()

    if (ingredients.any {it.equals(userInput, ignoreCase = true) }) {Свернуть комментарийПрокомментировать строку R7aisprints-ai прокомментировал on Aug 25, 2026 aisprints-искусственный интеллектon Aug 25, 2026Другие действияЗдесь проще проверить наличие элемента через in: тогда код будет короче и без лишней лямбды.ReactНаписать ответРазрешить комментарий
        println("Ингредиент $userInput в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}