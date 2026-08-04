
const val START_WEIGHT = 35
const val END_WEIGHT = 100
const val CAPACITY_AVERAGE = 100

fun main() {
    val startCargo = 20
    val capacity = 80
    val isCorrespondsWeight = (startCargo > START_WEIGHT && startCargo <= END_WEIGHT) && (capacity < CAPACITY_AVERAGE)
    println("Груз с весом $startCargo кг и объемом $capacity л соответствует категории 'Average': $isCorrespondsWeight")

    val twoCargo = 50
    val twoCapacity = 100
    val isCorrespondsWeightTwo =  (twoCargo > START_WEIGHT && twoCargo <= END_WEIGHT) && (twoCapacity < CAPACITY_AVERAGE)
    println("Груз с весом $twoCargo кг и объемом $twoCapacity л соответствует категории 'Average': $isCorrespondsWeightTwo")
}