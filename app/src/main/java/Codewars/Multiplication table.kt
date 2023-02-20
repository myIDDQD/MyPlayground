package Codewars

// Multiplication table
// https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08/train/kotlin

/* DESCRIPTION
Your task, is to create N×N multiplication table, of size provided in parameter.

For example, when given size is 3:

1 2 3
2 4 6
3 6 9
For the given example, the return value should be:

[[1,2,3],[2,4,6],[3,6,9]]
 */

/* ChatGPT
Solved it using ChatGPT, it turned out quite quickly :)
At a minimum, ChatGPT writes the basis of the solution, which needs to be slightly corrected
 */

object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        val table = Array(size) { IntArray(size) }
        for (i in 0 until size) {
            for (j in 0 until size) {
                table[i][j] = (i + 1) * (j + 1)
            }
        }
        return table
    }
}