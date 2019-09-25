package Rohman.BasicTypes

fun main(){
    val a: Int  = 1_000
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    // BoxedA and AnotherBoxedA can be null, but a cant

    println(boxedA === anotherBoxedA)
}