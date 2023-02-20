package Codewars
// Deodorant Evaporator
// https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/train/kotlin

/*
This program tests the life of an evaporator containing a gas.
We know the content of the evaporator (content in ml), the percentage of foam or gas lost every day (evap_per_day)
and the threshold (threshold) in percentage beyond which the evaporator is no longer useful.
All numbers are strictly positive.
The program reports the nth day (as an integer) on which the evaporator will be out of use.

Example:
evaporator(10, 10, 5) -> 29
 */

fun evaporator(content: Double, evapPerDay: Double, threshold: Double): Int {
    // Calculate threshold in ml
    val valueThreshold = content / 100 * threshold
    // Temp content
    var contentPerDay = content
    var result = 0
    while (contentPerDay > valueThreshold) {
        contentPerDay -= contentPerDay / 100 * evapPerDay
        result += 1
    }

// check test cases
//    println(result)
    return result
}

fun main() {
    // Test cases
    evaporator(10.0,10.0,10.0) // 22
    evaporator(10.0,10.0,5.0) // 29
    evaporator(100.0,5.0,5.0) // 59
}