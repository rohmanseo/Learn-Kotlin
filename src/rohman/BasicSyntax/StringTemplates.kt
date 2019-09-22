package rohman.BasicSyntax

fun main(){
    var a = 10

    //Simple name in template
    var b = "a is $a"

    a = 2

    //arbitrary expession in template
    var c = "${b.replace("is","was")}, But now is $a"
    print(c)

}