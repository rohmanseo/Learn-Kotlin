package Rohman.ClassesAndObjects

interface Shapes{
    val vertexCount: Int
}

class Rectangle: Shapes{
    override val vertexCount: Int = 2
}

//Overriding variable in primary constructor

open class Polygon(override val vertexCount: Int = 4): Shapes{
    val borderColor: String get() {
        return "Black " + "Mate"
    }
}

interface Polygon2{
    open fun draw(){}
}

open class Rectagle{
    open fun draw(){}
}

class Square() : Polygon2, Rectagle(){
    //The compiler required draw() to be overridden
    override fun draw(){
        super<Polygon2>.draw()
        super<Rectagle>.draw()
    }
}


fun main(){
    val polygon: Polygon = Polygon()
    println(polygon.borderColor)
}