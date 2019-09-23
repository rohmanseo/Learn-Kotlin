package rohman.ClassesAndObjects

class Constructors constructor(firstName: String)

//If the primary constuctor does has any visibility modifiers or annotations, the constuctor keyword can be omitted

class Constructors2(firstName: String)

fun main(){

    val constructors: Constructors = Constructors("Rohman")
    val constructors2: Constructors2 = Constructors2("Rohman")

}