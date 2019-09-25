package Rohman.BasicSyntax

fun main(){

    val items = listOf("Apple", "Banana", "Kiwi Fruit")

    for (item in items){
        println(item)
    }

    //Or you can use

    for (item in items.indices){
        println("Item in $item is ${items[item]}")
    }

}