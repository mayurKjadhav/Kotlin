class Dog {
    var breed= "doberman"
    var color = "black"
    var age = 2
    fun dogInfo(){
        println("It is $color coloured $age years old $breed ")
    }
}

fun main(){
    val dog = Dog()
    println("Breed : ${dog.breed}\nColor : ${dog.color}\nAge : ${dog.age}")
    dog.dogInfo()
    dog.age=3
    println("New Age : ${dog.age}")
}