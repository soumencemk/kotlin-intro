package basics

/**
 * @author Soumen Karmakar
 * 23/07/2020
 */

class Alien {
    var skills: String = "null"

}

fun main() {
    var a1 = Alien()
    a1.skills = "JAVA"
    a1.printSkills()

}

fun Alien.printSkills() {
    println("Skills : $skills")
}
