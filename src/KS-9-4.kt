fun main() {

    print("Введите ингредиенты:")
    val ingredients = readln().split(", ")
    val result = ingredients.sorted()
    println(result)

}