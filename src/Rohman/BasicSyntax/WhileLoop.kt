package Rohman.BasicSyntax

fun main(){

    val items = listOf("Apple","Banana", "Kiwi Fruit")

    var position = 0

    while (position < items.size){
        println(items[position])
        position++
    }

}