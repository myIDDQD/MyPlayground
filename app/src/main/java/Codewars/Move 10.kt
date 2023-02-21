package Codewars

// Move 10
// https://www.codewars.com/kata/57cf50a7eca2603de0000090/train/kotlin

/*
Move every letter in the provided string forward 10 letters through the alphabet.
If it goes past 'z', start again at 'a'.
Input will be a string with length > 0.
*/

fun moveTen(s: String) = s.map { (if (it.toInt() + 10 > 122) it.toInt() + 10 - 26 else it.toInt() + 10).toChar() }.joinToString("")

fun main() {
    // test cases
    moveTen("testcase") // "docdmkco"
    moveTen("codewars") // "mynogkbc"
    moveTen("exampletesthere") // "ohkwzvodocdrobo"
}