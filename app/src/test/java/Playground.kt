fun main() {
    println(fizzBuzz(10).joinToString(" ")) // "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"
    println(fizzBuzz(1).joinToString( " ")) // "1"
}

fun fizzBuzz(n: Int): Array<String> {
    return IntArray(n) { it + 1 }.toMutableList().map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }.toTypedArray()
}