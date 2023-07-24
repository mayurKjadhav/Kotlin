import java.lang.ArithmeticException

fun main(){
    //it is same as java
    val a = 10
    val b = 0
    val arr = arrayOf(1,2,3,4,5)
    try {
        arr[5]=0
        println("division : ${a/b}")
    }catch (e1:ArrayIndexOutOfBoundsException ){
        println("array is unto 4 index only")
    }catch(e2: ArithmeticException){
        println("cannot divide by zero")
    }
    finally {
        println("Addition : ${a+b}")
        println(arr.contentToString())
    }//it's okay not to write code in finally block it runs anyway it is optional

    println("--------------Null pointer exception---------------")

    //val str:String = null | this will give a NullPointerException
    // to cure that we use null safety operator that check the variable is null or not
    val str:String? = null // this will return the value null
    println("str is $str")

    println("--------------Null safety operator---------------")

    //to perform some operations on nullable variables we must have to use null safety operator.
    println("length of str is ${str?.length} ")

    println("------------Elvis operator-------------")
    // instead of printing null value we can print a message if the value of the variable is null
    println(str?.length ?: "This variable is null")

    println("------------Filter not null Function-------------")
    val arr1 = arrayOf(1,2,3,null,4,null,5)
    val list = listOf(10,9,8,7,null,6,null,5)
    println("Filtered array : ${arr1.filterNotNull()}\nFiltered list : ${list.filterNotNull()}")
}
