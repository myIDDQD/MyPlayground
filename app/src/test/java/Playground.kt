fun main() {
    // Read input from user
    val exabytes = readLine()!!.toDouble()

    // Convert exabytes to bits
    val bits = exabytes.pow(63)

    // Print result
    println(bits)
}

