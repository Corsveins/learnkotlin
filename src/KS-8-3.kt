fun main() {
    val ingredients = arrayOf("Картошка", "Свекла", "Лук")

    println("Выберите ингредиент:")
    val userInput = readln().trim()

    if (ingredients.any {it.equals(userInput, ignoreCase = true) }) {
        println("Ингредиент $userInput в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }


    
}