class Cat(animal: String , gender:String , name:String , color: String) : Animals(animal, gender, name , color){

    override fun sound(sound:String){
        println("$name sounds $sound")
    }
}