open class Animals(var animal:String, var gender:String , var name:String, var color:String) {
    fun information(){
        println("It is $gender $animal named $name and it's colour is $color")
    }
    fun leg(leg:Int){
        println("$name has $leg legs")
    }

    open fun sound(sound:String){
        println("I do $sound")
    }
}