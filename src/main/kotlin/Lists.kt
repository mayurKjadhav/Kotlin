
fun main(){
    println("\n\t----------Lists----------")
    //there are two types of lists
    //1) immutable lists <- same as array, we cannot replace any element and we cannot increase the size of immutable list
    //2) mutable lists <- we can increase the size and replace any element in mutable list.

    //Same as java Kotlin also support ArrayList and it is same as mutable lists
    println("\n\t---------- Immutable List ----------")

    val i = listOf<Any>("Mayur Jadhav", 7262923130 , 'A', 9.0)
    print("\n\t$i")
    // we cannot perform any operation on this list except retrieve the data
    print("\n\t3rd element is ${i[3]}")
    print("\n\tIndex of String is ${i.indexOf("Mayur Jadhav")}")
    println("\n\tSize of the list is ${i.size}")

    println("\n\t---------- Immutable List ----------")
    var j = mutableListOf<Any>("Mayur", 1234 , 9.0 , true)
    print("\n\tOriginal List : $j")
    print("\n\tReplace 1st index with boolean value ")
    j[1]=1
    print(j)
    j.remove(1)
    print("\n\t$j")
    j.clear()
    println("\n\t$j")

    println("\n\t---------- Array List ----------")
    var ArrayLists = arrayListOf<Any>("Mayur", 1234, 1.3, true)
    println ("\n\t$ArrayLists")
    // We can perform same operations as Mutable list on arraylist

}