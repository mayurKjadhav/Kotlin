fun display():Unit{
   println("Im from display function")
}
fun add(a:Int, b: Int) = a+b
fun divide(a:Double, b:Double)= a/b
fun max(a:Int, b:Int) = maxOf(a,b)
fun main(){
   display()
   println("Addition is : ${add(2,3)}")
   println("Max is : ${max(2,4)}")
   print("division is : ${divide(2.3 ,4.0)}")
}