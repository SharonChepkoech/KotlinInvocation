fun main(){
   modulus(15,6)
    greeting("Cheko")
    addition(2,4,5,7)
    interesting("I love babies")

}

fun greeting(name: String){
    println("Hello "+name)
}
fun modulus(a:Int,b:Int){
    var result= a%b
    println(result)
}
fun addition(a:Int,b:Int,c:Int,d:Int){
    var result= a+b+c+d
    println(result)
}
fun interesting(fact: String){
    println("One fun thing about me is "+fact)
}