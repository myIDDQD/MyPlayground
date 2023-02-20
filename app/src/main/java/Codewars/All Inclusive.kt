package Codewars

// All Inclusive?
// https://www.codewars.com/kata/5700c9acc1555755be00027e/train/kotlin

//Input:
//
//a string strng
//an array of strings arr
//Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
//
//a boolean true if all rotations of strng are included in arr
//false otherwise
//Examples:
//contain_all_rots(
//"bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true
//
//contain_all_rots(
//"Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)
//Note:
//Though not correct in a mathematical sense
//
//we will consider that there are no rotations of strng == ""
//and for any array arr: contain_all_rots("", arr) --> true

fun main() {
    // Test cases
    var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    containAllRots("bsjq", a) // true
    a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    containAllRots("XjYABhR", a) // false
}

fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
// Initialize a variable with the original string
    var rotatedString = strng

// Create a new list and add the original string
    val list = arrayListOf(rotatedString)

// Loop through each character in the string
    for (i in 1 until strng.length) {
        // Rotate the string by removing the first character and adding it to the end
        rotatedString = rotatedString.substring(1) + rotatedString[0]
        // Add the rotated string to the list
        list += rotatedString
    }

    //    Output checking test cases
    //    println((list - arr).isEmpty())

    // Use the minus operator to remove all elements in the original list that are not in the input list
    // Check if the resulting list is empty, if it is return true, else return false
    return (list - arr).isEmpty()
}

// Part of code and comments was write with help ChatGPT