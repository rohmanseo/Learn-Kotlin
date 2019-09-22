package rohman.BasicSyntax

import java.lang.Integer.parseInt

fun main(){

    fun printIt(a: String, b: String){
        val x = parseInt(a)
        val y = parseInt(b)

        if(x != null && y != null){
            println(x * y);
        }else{
            println("'$a' or '$b' is not a number")
        }
    }

    printIt("10","j")

}