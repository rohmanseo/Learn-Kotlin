package Rohman.ClassesAndObjects

open class Base(p: Int)

//to decralare an explicit supertype, place the type after a colon in the class header

class Derrived(p: Int) : Base(p){
    init {
        println(p)
    }
}

open class Shape{
    open fun draw(){}
}

//Overriding draw() method from superclass

class Circle(): Shape(){
    override fun draw() {
        super.draw()
    }
}

//Overriding name variable from superclass

open class Person{
    open var name: String = "Rohman"
}

class Rohman(): Person(){
    override var name = "R"
}


fun main(){
    var derrived: Derrived = Derrived(10)
}