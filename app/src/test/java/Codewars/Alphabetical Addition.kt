package Codewars

// Alphabetical Addition
// https://www.codewars.com/kata/5d50e3914861a500121e1958/train/kotlin

/*
Your task is to add up letters to one letter.

The function will be given a List<Char>, each one being a letter to add, and the function will return a Char.

Notes:
Letters will always be lowercase.
Letters can overflow (see second to last example of the description)
If no letters are given, the function should return 'z'


My notes
a = 1
b = 2
c = 3
d = 4
.
.
.
y = 25
z = 26
 */

fun addLetters(arr: List<Char>) : Char {
    val alphabet = 'a'..'z'
    var index = 0

    return if (arr.isNotEmpty()) {
        arr.forEach { index += alphabet.indexOf(it) + 1 }
        alphabet.filterIndexed { i, _ -> i == if (index > 26) index - 27 else index - 1 }.first()
    } else {
        'z'
    }
}
// One more solution
//fun addLetters(arr: List<Char>) = "zabcdefghijklmnopqrstuvwxy"[arr.fold(0) { acc, x -> acc + x.toInt() - 96 } % 26]

fun main() {
    addLetters(listOf('a', 'b', 'c')) // 'f'
    addLetters(listOf('z')) // 'z'
    addLetters(listOf('a', 'b')) // 'c'
    addLetters(listOf('c')) // 'c'
    addLetters(listOf('z', 'a')) // 'a'
    addLetters(listOf('y', 'c', 'b')) // 'd'
    addLetters(listOf()) // 'z'
}