
const val TODAY_BUSY_TABLES = 13
const val TOMORROW_BUSY_TABLES = 9
const val ALL_TABLES = 13

fun main() {

    val todayAvalibleTables = ALL_TABLES > TODAY_BUSY_TABLES
    val tommorowAvailableTables = ALL_TABLES > TOMORROW_BUSY_TABLES

    println("Доступность столиков на сегодня: $todayAvalibleTables \nДоступность столиков на завтра: $tommorowAvailableTables")




}