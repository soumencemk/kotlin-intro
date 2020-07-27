package basics

fun main(args: Array<String>) {
/*    val id = arrayOf(1,2,3,4)
    for (i in id) {
        println(i)
    }*/
    val asc = Array(5, { i -> i * 2 })
    for (i in asc) {
        println(i)
    }

    var text = """
        
        Oh my god, multiline !!! :D
        
            I am gonna faint;
    """

    println(text)
}