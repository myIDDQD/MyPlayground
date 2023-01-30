package Codewars

// Simple Simple Simple String Expansion
// https://www.codewars.com/kata/5ae326342f8cbc72220000d2/train/kotlin

/*
Given a string that includes alphanumeric characters ("3a4B2d") return the expansion of that string:
The numeric values represent the occurrence of each letter preceding that numeric value.
There should be no numeric characters in the final string.

Notes
The first occurrence of a numeric value should be the number of times each character behind it is repeated,
until the next numeric value appears
If there are multiple consecutive numeric characters, only the last one should be used (ignore the previous ones)
Empty strings should return an empty string.
Your code should be able to work for both lower and capital case letters.

"3D2a5d2f"  -->  "DDDaadddddff"    # basic example: 3 * "D" + 2 * "a" + 5 * "d" + 2 * "f"
"3abc"      -->  "aaabbbccc"       # not "aaabc", nor "abcabcabc"; 3 * "a" + 3 * "b" + 3 * "c"
"3d332f2a"  -->  "dddffaa"         # multiple consecutive digits: 3 * "d" + 2 * "f" + 2 * "a"
"abcde"     -->  "abcde"           # no digits
"1111"      -->  ""                # no characters to repeat
""          -->  ""                # empty string
 */

fun main() {
    // Tests
    stringExpansion("3D2a5d2f4D1a8d4j3k0c3b1n7m") // expected:<[]bbbnmmmmmmm> but was:<[c]bbbnmmmmmmm>
    stringExpansion("3D2a5d2f") // "DDDaadddddff"
    stringExpansion("3abc") // "aaabbbccc"
    stringExpansion("3d332f2a") // "dddffaa"
    stringExpansion("abcde") // "abcde"
    stringExpansion("1111") // ""
    stringExpansion("") // ""
}


fun stringExpansion(s: String): String {
    val result = StringBuilder()
    var repeat = 0
    for (c in s) {
        if (c.isDigit()) {
            repeat = 0
            repeat = repeat * 10 + (c - '0')
        } else {
            if (repeat == 0)
                result.append(c)
            else
                (0 until repeat).forEach { result.append(c) }
        }
    }
    println(result.toString())
    return result.toString()
}



