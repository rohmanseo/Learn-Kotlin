package Rohman.ClassesAndObjects

class Constructors constructor(firstName: String)

//If the primary constuctor does has any visibility modifiers or annotations, the constuctor keyword can be omitted

class Constructors2(firstName: String)

//Different way to define construktor

class Constructor3{
    private val firstName: String

    constructor(firstName: String){
        this.firstName = firstName
    }

    fun getName(): String = firstName
}

fun main(){

    val constructors: Constructors = Constructors("Rohman")
    val constructors2: Constructors2 = Constructors2("Rohman")
    val constructors3: Constructor3 = Constructor3("Rohman")

    println(constructors3.getName())

}