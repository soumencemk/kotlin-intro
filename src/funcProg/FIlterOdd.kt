package funcProg

/**
 * @author Soumen Karmakar
 * 25/07/2020
 */

fun filterOddNumbers(ns: Collection<Int>): Collection<Int> {

    var out = mutableListOf<Int>()

    for (n in ns) {
        if (n % 2 == 0) out.add(n)
    }
    return out
}

fun main() {
    assert(filterOddNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)) == listOf(1, 3, 5, 7, 9))
    assert(filterOddNumbers(listOf(2, 6, 8, 0)) == listOf(2, 6, 8, 0))
}