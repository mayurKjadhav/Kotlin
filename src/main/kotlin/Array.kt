import java.util.Arrays
import kotlin.coroutines.coroutineContext

fun main(){
    var array:Array<Any> =  arrayOf('m','a','y','u','r') // Proper declaration of array
    val array1:Array<Any> = arrayOf('z','b','c','a','f')// Type inference
    var array2:Array<Any> = arrayOf("mayur", 1 , 1.2 , true)
    var array3 = arrayOf<String>("Mayur","Kundlik","Jadhav")
    println(array3.contentToString())
    // we can add any type of element in array by mentioning Any keyword
    // there is no need to specify the datatype when we are immediately initializing the array
    println(array2.contentToString())
    println("original array : ${array.contentToString()}")
    //We can replace the whole array with another array having same length.
    //we cannot replace the val type array.
    // array length cannot be increased after its initialization
    array = array1
    println(array.contentToString())

    var array4 = arrayOf("Mayur Jadhav","Mit Wpu","Pune")
    println(array4.contentToString()) // printing the array of strings

    array[3]="string"
    println("Replace with String ${array.contentToString()}")
    val even = arrayOf(2,4,6,8,10)
    val odd = arrayOf(1,3,5,7,9)
    var c:Int
    var i=0
    while(i<even.size){
        c = even[i]+odd[i]
        i++
        print("$c\t")
    }
}