package Rohman.BasicTypes

fun main(){

    //A raw String is delimited by a triple quotes (""") contains no escaping and contain new line and any other characters

    val name: String = """
        Name            : Nur Rohman
        Major           : KOMSI
        StudenNumber    : 15708
    """.trimIndent()

    println(name)

}