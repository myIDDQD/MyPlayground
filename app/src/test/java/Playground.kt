import kotlin.math.ceil

// https://www.codewars.com/kata/562f91ff6a8b77dfe900006e/train/kotlin

// My friend John likes to go to the cinema. He can choose between system A and system B.
// System A : he buys a ticket (15 dollars) every time
// System B : he buys a card (500 dollars) and a first ticket for 0.90 times the ticket price,
// then for each additional ticket he pays 0.90 times the price paid for the previous ticket.
// Example:
// If John goes to the cinema 3 times:
//
// System A : 15 * 3 = 45
// System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)
// John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.
//
// The function movie has 3 parameters:
// card (price of the card),
// ticket (normal price of a ticket),
// perc (fraction of what he paid for the previous ticket)
// and returns the first n such that

// More examples:
// movie(500, 15, 0.9) should return 43 (with card the total price is 634, with tickets 645)
// movie(100, 10, 0.95) should return 24 (with card the total price is 235, with tickets 240)

fun main() {
    // Fixed Tests
    movie(500, 15, 0.9) // 43
    movie(100, 10, 0.95) // 24
    movie(0, 10, 0.95) // 2

    // Random Tests
    movie(478136, 11, 0.86) // 43474
    movie(578090, 29, 0.46) // 19936
}

fun movie(card: Int, ticket: Int, perc: Double) : Int {
    var ticketsTotal = 0
    var cardDiscount = card.toDouble()
    var ticketPriceDiscount = ticket * perc
    var count = 0

    while (ticketsTotal <= ceil(cardDiscount)) {
        ticketsTotal += ticket
        cardDiscount += ticketPriceDiscount
        ticketPriceDiscount *= perc
        count += 1

// debugging
//        println("ticketsTotal = $ticketsTotal --- " +
//                "cardDiscount = $cardDiscount --- " +
//                "ticketPriceDiscount = $ticketPriceDiscount --- " +
//                "count = $count")
    }

// debugging
    println(count)
    return count
}