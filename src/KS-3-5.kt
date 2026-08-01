fun main() {
    val lineStr = "D2-D4;0"
    val lineing = lineStr.split("-",";")

    val moveOn = lineing[0]
    val moveIn = lineing[1]
    val motion = lineing[2]
    println(moveOn)
    println(moveIn)
    println(motion)
}