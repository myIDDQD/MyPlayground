package Codewars
// Predict your age!
// https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/kotlin

/*
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

In honor of my grandfather's memory we will write a function using his formula!

Take a list of ages when each of your great-grandparent died.
Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.
Example
predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
 */

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    return (Math.sqrt(mutableListOf(age1, age2, age3, age4, age5, age6, age7, age8).sumOf { it * it }.toDouble()) / 2).toInt()
}

fun main() {
    predictAge(65, 60, 75, 55, 60, 63, 64, 45).let(::println) // 86
    predictAge(32, 54, 76, 65, 34, 63, 64, 45).let(::println) // 79
}