package JetBrainsAcademy

// Calculator
// https://hyperskill.org/learn/daily/15434

//You have four functions: add, subtract, multiply, and divide:
//fun add(x: Int, y: Int) = x + y
//fun subtract(x: Int, y: Int) = x - y
//fun multiply(x: Int, y: Int) = x * y
//fun divide(x: Int, y: Int) = x / y

//In this task, you should create a calculator by using function references of these four functions.
//As input, you are given two numbers and the name of the action you should perform on the numbers. You need to output the result.
//The action names can be: add, subtract, multiply, or divide.
//Guaranteed that y can't be 0 when the action is divide.
//Sample Input:
//3 2 multiply
//Sample Output:
//6

fun add(x: Int, y: Int): Int = x + y
fun subtract(x: Int, y: Int) = x - y
fun divide(x: Int, y: Int) = x / y
fun multiply(x: Int, y: Int) = x * y

fun calculate(x: Int, y: Int, operator: (Int, Int) -> Int) {
    // write your code here
    val result = operator(x, y)
    print(result)
}

fun main() {
    val x: Int = readln().toInt()
    val y: Int = readln().toInt()
    when (readln()) {
        // write your code here
        "add" -> calculate(x, y, ::add)
        "subtract" -> calculate(x, y, ::subtract)
        "multiply" -> calculate(x, y, ::multiply)
        "divide" -> calculate(x, y, ::divide)
    }
}