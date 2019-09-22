package rohman.BasicSyntax

fun main(){
    fun getLength(obj: Any): Int?{
        if(obj is String){
            // 'obj' is automatically cast to String on this branch
            return obj.length
        }else if (obj is Int){
            // 'obj' is automatically cast to Int on this branch
            return obj
        }else{
            return null
        }
    }

    // println(getLength("Hello World"))
    println(getLength(10))

}