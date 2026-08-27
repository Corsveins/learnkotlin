fun main() {
    val ingredients = arrayOf("Картошка", "Свекла", "Лук")

    println("Выберите ингредиент:")
    val userInput = readln().trim()

    for (item in ingredients) {
        if (userInput.equals(item, ignoreCase = true)) {
            println("Ингредиент $item в рецепте есть")
            return
        }
    }


    println("Такого ингредиента в рецепте нет")
}