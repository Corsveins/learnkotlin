fun main() {

    val ingridient = listOf("Яйца","Хлеб","Яблоко")

    println("В рецепте есть следующие ингредиенты:")
    ingridient.forEach { elemnt ->
        println("$elemnt")
    }
}