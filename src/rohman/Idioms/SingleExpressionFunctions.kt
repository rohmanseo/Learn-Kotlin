package rohman.Idioms

fun main(){

    /*
    This is equivalent to
    fun hello(){
        return "Hello World"
    }
     */
    fun hello() = "Hello world"

    var newProgrammer: String = hello()
    println(newProgrammer)

    fun calculate(a: Int,b: Int) = a + b

    var sum = calculate(10,20)
    println(sum)

    //Lets combined with when :)

    fun getColorCode(color: String) : Int = when (color){
        "Red" -> 1
        "Blue" -> 2
        "Yellow" -> 3
        else -> 0
    }

    val color = getColorCode("Red")
    println(color)

}