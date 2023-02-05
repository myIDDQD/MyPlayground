package Codewars

// Convert string to camel case
// https://www.codewars.com/kata/517abf86da9663f1d2000003/train/kotlin

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */

fun main() {
    // Tests
    toCamelCase("") // ""
    toCamelCase("the_stealth_warrior") // "theStealthWarrior"
    toCamelCase("The-Stealth-Warrior") // "TheStealthWarrior"
    toCamelCase("A-B-C") // "ABC"
}

fun toCamelCase(str: String) : String {
    val result = ("[-_]").toRegex().split(str).toMutableList()
    ("[-_]").toRegex().split(str).forEachIndexed { index, s -> if (index != 0) result[index] = s.capitalize() else result[0] }

    println(result.joinToString(""))
    return result.joinToString("")
}