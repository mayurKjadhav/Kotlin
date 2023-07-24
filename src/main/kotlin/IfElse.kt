import java.util.*

fun compareArrayLength(a: Array<String> , b: Array<String>  )= a.size==b.size
fun main(){
    val a= 10
    val b = 1
    if(b==0)
        println("b cannot be zero please change b")
    else
        println("Division : ${a/b}")

    //we can assign the value to a variable by using a expression
    val c:Int = if(a>b){ a } else{ b }
    println("max is $c")

    val str="Mayur"
    val char = 'm'
    val num = 12
    val decimal = 1.3

    if(a > b)
        println("$a is grator")
    if(str=="Mayur")
        println("equal")
    else
        println("not equal")

    when(a){
        in 1..30-> println("$a is grator")
        b -> println(" Equal ")
        else -> print("noting has happened")
    }

    val s1 = "Mayur"
    val s2 = "Mayur"
    print("length is ${if(s1.length==s2.length) "same" else "Not Same"}")

    val y = arrayOf("Internshala", "Trainings")
    val z = arrayOf("Android", "Developement")
    println(" \n\tLength is ${if(compareArrayLength(y, z)) "Equal" else "Not Equal" }")

    val n = 40
    print("Number ${if(n in 30..50) "lies " else "Does not lies "} between 30 to 50")
}