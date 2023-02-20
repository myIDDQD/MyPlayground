package Codewars

// Two to One
// https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/kotlin

/*
Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string, the longest possible,
containing distinct letters - each taken only once - coming from s1 or s2.
*/

fun longest(s1:String, s2:String) = (s1 + s2).toSet().sorted().joinToString("")

fun main() {
//    test cases
    longest("aretheyhere", "yestheyarehere").let { println(it) } // "aehrsty"
    longest("loopingisfunbutdangerous", "lessdangerousthancoding").let { println(it) }  // "abcdefghilnoprstu"
    longest("inmanylanguages", "theresapairoffunctions").let { println(it) }  // "acefghilmnoprstuy"
}