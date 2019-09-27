package Rohman.ClassesAndObjects

//extension properties allow you to add new properties for existing classes

fun String.printHello(){
    println("Hello $this")
}

fun MutableList<Int>.swap(index1: Int, index2: Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//Nullable receiver type
fun Any?.toString(): String{
    if (this == null) {return "NULL"}
    return this.toString()
}

fun main(){
    "Rohman".printHello()
    val arr = arrayListOf(0,2,3)
    arr.swap(0,1)
    println(arr)
    println(null.toString())
    println(2.toString())
}