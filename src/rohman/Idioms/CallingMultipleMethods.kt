package rohman.Idioms

class Student {
    fun printName(){
        println("Rohman")
    }
    fun printNumber(){
        println(15708)
    }
}

fun main(){

    val rohman: Student = Student()

    //For calling multiple methods we can use "with"
    with(rohman){
        printName()
        printNumber()
    }

}