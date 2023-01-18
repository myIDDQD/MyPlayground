package JetBrainsAcademy

// Advanced debugger features
// Boxed primitive

// https://hyperskill.org/repeat/step/16033

// Create a collection and put a Int number into the collection val list = listOf<Int>(1)
// and figure out which library function of which class is implicitly called before this happens.
// The answer should be in the form <class name>.<method name>.
// Use Force Step Into to quickly find a method.

// Hint
// Create some collection of Int. Put a breakpoint on this line.
// To get the answer, you need to press Force Step Into in the Debug tool window.

fun main() {
    val list = listOf(1)
}

// Correct answer --- Integer.valueOf()
