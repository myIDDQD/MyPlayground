package JetBrainsAcademy

// The function doubleFormat(value: Double, width: Int, precision: Int)
// formats a string of the value number,
// with the width equal to width and the number of decimal digits equal to precision.
// Sample Input 1:
// 672.457 7 1
// Sample Output 1:
// 672.5

fun doubleFormat(value: Double, width: Int, precision: Int) = String.format("%.${precision}f", value)

// test
fun main() = println(doubleFormat(672.457, 7, 1))