package Rohman.ClassesAndObjects

class MyClass{
    companion object Factory{
        fun create(): MyClass = MyClass()
    }
}

fun main(){
    val instance = MyClass.create()
}