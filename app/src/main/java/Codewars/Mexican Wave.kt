package Codewars

// Mexican Wave
// https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/kotlin

/* Task
In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules
 1.  The input string will always be lower case but maybe empty.

 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
Example
wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */

fun main() {
    wave("a       b    ").let(::println) // listOf("A       b    ", "a       B    ")
    wave("this is a few words")
/*
listOf("This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS")
 */
    wave("").let(::println) // listOf<String>()
    wave(" gap ").let(::println) // listOf(" Gap ", " gAp ", " gaP ")
}

fun wave(str: String): List<String> {
    val resultList = mutableListOf<String>()

    for (i in str.indices) {
        var tempStr = ""
        for ((index, c) in str.lowercase().withIndex()) {
            tempStr += if (index == i) c.uppercase() else c
        }
        resultList.add(tempStr)
    }

    resultList.removeAll(listOf(str))

    return resultList
}