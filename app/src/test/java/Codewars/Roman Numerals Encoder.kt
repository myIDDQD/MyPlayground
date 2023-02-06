package Codewars

// Roman Numerals Encoder
// https://www.codewars.com/kata/51b62bf6a9c58071c600001b

/* DESCRIPTION:
Create a function taking a positive integer between 1 and 3999 (both included)
as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately
starting with the left most digit and skipping any digit with a value of zero.
In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.

Example:
encode(1000) // should return "M"

Help:
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.
 */

/* ChatGPT
Solved it using ChatGPT, it turned out quite quickly :)
At a minimum, ChatGPT writes the basis of the solution, which needs to be slightly corrected
 */

fun main() {
//    Tests
    println(encode(1))
}

fun encode(number: Int): String {
    var num = number
    val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val symbols = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    val result = StringBuilder()
    var i = 0
    while (num > 0) {
        val count = num / values[i]
        for (j in 0 until count) {
            result.append(symbols[i])
        }
        num %= values[i]
        i++
    }
    return result.toString()
}