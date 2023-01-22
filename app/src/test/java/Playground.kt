fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>) : MutableMap<String, Int> {
    val purchase = (purchases + addition).toMutableMap()
    purchase.map { if (purchases.keys.contains(it.key) && addition.keys.contains(it.key)) purchase[it.key] = purchases[it.key]!! + addition[it.key]!! }
    return purchase
}

fun main() {
    val purchases = mutableMapOf("bread" to 1, "potatoes" to 7, "milk" to 2)
    val addition = mutableMapOf("milk" to 1, "water" to 3)
    println(helpingTheRobot(purchases, addition))
    println("{bread=1, potatoes=7, milk=3, water=3}")
}

