import java.awt.Color

class Dogs constructor(var breed:String, var color:String, var age:Int){
    fun dogInformation(){
        println("Breed : $breed\nAge : $age\nColor : $color")
    }
}
fun main(){
    val dog = Dogs("doberman", "black", 2)
    dog.dogInformation()
}