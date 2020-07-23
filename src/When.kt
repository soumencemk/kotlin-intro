import java.util.*

/**
 * @author Soumen Karmakar
 * 17/07/2020
 */

fun main() {
    print("Enter Number : ")
    var numer = Scanner(System.`in`).nextInt()
    var number = when (numer) {
        1 -> "ONE"
        2 -> "TWO"
        3 -> "THREE"
        4 -> "FOUR"
        5 -> "FIVE"
        6 -> "SIX"
        7 -> "SEVEN"
        8 -> "EIGHT"
        9 -> "NINE"
        10 -> "TEN"
        else -> "NAN"
    }
    println("You have entered $number")

    print("Enter HOUR : ")
    var hour = Scanner(System.`in`).nextInt()
    when (hour) {
        in 6..11 -> println("Good Morning")
        in 12..18 -> println("Good Afternoon")
        19, 20 -> println("Good Evening")
        in 21..24 -> println("Good Night")
    }
}