package JetBrainsAcademy

import java.time.LocalDate

fun daysForward(date: String, days: Int) {
    val localDate = LocalDate.parse(date)
    val daysForward = localDate.plusDays(days.toLong())
    println(daysForward.toString())
}

fun main() {
    val date = readLine()!!
    val days = readLine()!!.toInt()
    daysForward(date, days)
}