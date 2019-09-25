package Rohman.Idioms

fun main(){

    var a = 10
    var b = 20

    b = a.also { a = b }

    println(a)
    println(b)

}