/**
 * @author Soumen Karmakar
 * 17/07/2020
 */

fun main() {
    println(" ---------- Number Compare ------------")

    print("Enter 1st no : ")
    val a = Integer.parseInt(readLine())
    print("Enter 2nd no : ")
    val b = Integer.parseInt(readLine())

    val result = if (a > b) {
        "$a is greater than $b"
    } else {
        "$b is greater than $a"
    }
    println(result)
}
