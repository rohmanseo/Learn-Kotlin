package rohman.BasicSyntax

fun main() {

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        }
        return b
    }

    println(maxOf(30,50))

    //In kotlin, expression can be used as an expression
     fun max(a:Int,b: Int) = if (a>b) a else b

    println(max(29,199))


}