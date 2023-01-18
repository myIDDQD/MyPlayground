// In John's car the GPS records every s seconds the distance travelled
// from an origin (distances are measured in an arbitrary but consistent unit).
// Given s and x the task is to return as an integer
// the *floor* of the maximum average speed per hour obtained on the sections of x.
// If x length is less than or equal to 1 return 0 since the car didn't move.
// https://www.codewars.com/kata/56484848ba95170a8000004d/train/kotlin

fun main() {
    var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
    gps(20, x) // 41
    x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
    gps(12, x).let { println(it) } // 219
}

fun gps(s: Int, x: DoubleArray) = mutableListOf<Int>()
    .also { average ->
        x.toList()
        .windowed(2)
        .forEach { average.add(((3600 * (it[1] - it[0])) / s).toInt()) }
    }.maxOrNull() ?: 0



