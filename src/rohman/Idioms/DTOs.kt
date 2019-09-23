package rohman.Idioms

/* Provied a class with following functionallity :
    -Getter and Setter
    -toString
    -hashCode
    -copy
 */

data class Person(var name: String, var email: String)

fun main(){
    var rohman: Person = Person("Rohman","rohmann311@gmail.com")
    println(rohman)

}
