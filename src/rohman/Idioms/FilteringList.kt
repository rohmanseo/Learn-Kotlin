package rohman.Idioms

fun main(){
    var list = arrayOf(1,2,-3,4,5)

    val positives = list.filter { y -> y > 0 }
    // Or alternatively even shorter
    val positives2 = list.filter { it > 0 }

    println(positives2)
}