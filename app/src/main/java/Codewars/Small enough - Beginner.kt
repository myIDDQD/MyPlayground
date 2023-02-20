package Codewars
// Small enough? - Beginner
// https://www.codewars.com/kata/57cc981a58da9e302a000214/train/kotlin

// You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.


fun smallEnough(a : IntArray, limit : Int) = !a.map { it <= limit }.contains(false)

fun main() {
    // test cases
    smallEnough(intArrayOf(66, 101), 200).let { println(it) } // true
    smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100).let { println(it) } // false
    smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107).let { println(it) } // true
    smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120).let { println(it) } // true
}