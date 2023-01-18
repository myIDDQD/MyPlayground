package Codewars

// Sum of odd numbers
// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/kotlin
// Given the triangle of consecutive odd numbers:
// 1
// 3     5
// 7     9    11
// 13    15    17    19
// 21    23    25    27    29

// Calculate the sum of the numbers in the nth row of this triangle
// (starting at index 1) e.g.: (Input --> Output)
// 1 --> 1
// 2 --> 3 + 5 = 8

fun rowSumOddNumbers(n: Int): Int {
    return 0
}

fun main() {
    rowSumOddNumbers(1) // 1
    rowSumOddNumbers(2) // 8
    rowSumOddNumbers(13) // 2197
    rowSumOddNumbers(19) // 6859
    rowSumOddNumbers(41) // 68921
    rowSumOddNumbers(42) // 74088
    rowSumOddNumbers(74) // 405224
    rowSumOddNumbers(86) // 636056
    rowSumOddNumbers(93) // 804357
    rowSumOddNumbers(101) // 1030301
}