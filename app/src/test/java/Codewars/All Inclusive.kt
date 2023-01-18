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
    var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    containAllRots("bsjq", a) // true
    a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
    containAllRots("XjYABhR", a) // false
}

fun containAllRots(srt: String, arr: ArrayList<String>) : Boolean {
    var res = true
    arr.forEach {
        a -> a.forEach {
            if (!srt.contains(it)) res = false
        }
    }
    println(res)
    return res
}
