package Codewars

// Lottery Ticket
// https://www.codewars.com/kata/57f625992f4d53c24200070e/train/kotlin

/*
Time to win the lottery!

Given a lottery ticket (ticket), represented by an array of 2-value arrays, you must find out if you've won the jackpot.

Example ticket:
[ [ 'ABC', 65 ], [ 'HGR', 74 ], [ 'BYHT', 74 ] ]
To do this, you must first count the 'mini-wins' on your ticket. Each subarray has both a string and a number within it. If the character code of any of the characters in the string matches the number, you get a mini win. Note you can only have one mini win per sub array.

Once you have counted all of your mini wins, compare that number to the other input provided (win). If your total is more than or equal to (win), return 'Winner!'. Else return 'Loser!'.

All inputs will be in the correct format. Strings on tickets are not always the same length.
 */

fun main() {
    // Tests
    bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 2) // "Loser!"
    bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 1) // "Winner!"
    bingo(arrayOf("HGTYRE" to 74, "BE" to 66, "JKTY" to 74), 3) // "Loser!"
}


fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
    println (if (ticket.map { p -> p.first.map { c -> c.code } to p.second }.map { it.first.contains(it.second) }.filter { it }.size >= win) "Winner!" else "Loser!")
    return if (ticket.map { p -> p.first.map { c -> c.code } to p.second }.map { it.first.contains(it.second) }.filter { it }.size >= win) "Winner!" else "Loser!"
}