package Rohman.ClassesAndObjects

//The primary constructor cant contain any code, so you can use init keyword to add more code in classes

class InitKeyword(name: String){
    val firstProperty = "First Property : $name".also(::println)

    init {
        println("First Initialize block that prints $name")
    }

    val secondProperty = "Second Property : ${name.length}".also(::println)

    init {
        println("Second initialize block that prints ${name.length}")
    }
}

class Mahasiswa{
    init {
        println("Hello Mahasiswa")
    }
}

class Mobil(name: String, brand: String, year: Int){
    init {
        println("""
            You have a car with following spesification :
            Name       : $name
            Brand      : $brand
            Year       : $year
        """.trimIndent())
    }
}

fun main(){
    val mahasiswa: Mahasiswa = Mahasiswa()
    val avanza: Mobil = Mobil("Avanza","Toyota",2019)
}