package rohman.BasicSyntax

fun main(){
    //Output
    println("Hello World")
    println(sum(10, 20))
    printSum(10, 30)
    printSum2(30, 20)

}

//Function with expression body and inferred return type
fun sum(a: Int, b: Int): Int{
    return (a+b)
}

//Function returning no meaningful value
fun printSum(a: Int, b:Int): Unit{
    println("Sum of $a and $b is ${a+b}" )
}

//Actually, Unit can be omitted
fun printSum2(a: Int, b:Int){
    println("Sum of $a and $b is ${a + b}")
}

