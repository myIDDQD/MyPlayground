// In a small town the population is p0 = 1000 at the beginning of a year.
// The population regularly increases by 2 percent per year and
// moreover 50 new inhabitants per year come to live in the town.
// How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
// https://www.codewars.com/kata/563b662a59afc2b5120000c6

fun main() {
    nbYear(1500, 5.0, 100, 5000) // 15
    nbYear(1500000, 2.5, 10000, 2000000) // 10
    nbYear(1000, 2.0, 50, 1200) // 10
}

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    var years = 0
    var pop = pp0
    while (pop < p) {
        years += 1
        pop = (pop + pop * (percent / 100) + aug).toInt()

    }
    println(years)
    return years
}

