fun rollDice(): Int = (1..6).random()

fun main() {

    val moveHuman = rollDice()
    println("Ход человека $moveHuman")

    val moveMachine = rollDice()
    println("Ход машины $moveMachine")


    when {
        moveHuman > moveMachine -> println("Победило человечество")
        moveHuman < moveMachine -> println("Победила машина")
        else -> println("Победила дружба")
    }
}
