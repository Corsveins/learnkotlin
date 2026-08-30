fun main() {

    val ingridient = listOf("Яйца","Хлеб","Яблоко")

    var i = 0

    ingridient.forEach { elemnt ->
        println("В рецепте есть следующие ингредиенты:$elemnt")
        i++
    }

}