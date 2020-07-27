package basics

/**
 * @author Soumen Karmakar
 * 23/07/2020
 */


data class Book(val name:String,val price:Int)

fun main() {
    val book1 = Book("Book1", 1);
    val book2 = Book("Book2", 1);
    println(book1)
}