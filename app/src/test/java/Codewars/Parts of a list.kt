package Codewars

// Parts of a list
// https://www.codewars.com/kata/56f3a1e899b386da78000732/train/kotlin

/* Instructions
Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.

Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
Each part will be in a string
Elements of a pair must be in the same order as in the original array.
Examples of returns in different languages:
a = ["az", "toto", "picaro", "zone", "kiwi"] -->
[["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
 */

fun main() {
    var s1 = arrayOf("cdIw", "tzIy", "xDu", "rThG")
    partlist(s1) // "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
    s1 = arrayOf("I", "wish", "I", "hadn't", "come")
    partlist(s1) // "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
}

fun partlist(arr: Array<String>): Array<Array<String>> {
    val result = mutableListOf<Array<String>>()
    for (i in 1 until arr.size) {
        result.add(arrayOf(arr.slice(0 until i).joinToString(" "), arr.slice(i until arr.size).joinToString(" ")))
    }
    return result.toTypedArray()
}
