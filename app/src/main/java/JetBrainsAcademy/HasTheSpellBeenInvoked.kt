package JetBrainsAcademy
// Has the spell been invoked?
// https://hyperskill.org/learn/step/22089#solutions-2090297

// A wizard has recited a list of words, but we know that only "abracadabra" casts the spell. Has it been spoken? Return true if the list contains the word "abracadabra" in upper, lower, or mixed case.
// Sample Input:
// mom dog ABRACADABRA
// Sample Output:
// true

fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.any { it.uppercase() == "ABRACADABRA" }
    println(res)
}

