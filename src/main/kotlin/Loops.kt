fun main(){
    val array = arrayOf('m','a','y','u','r')
    println("----------For Loop----------")
    for(i in 0..10){
        println("\t$i")
    }

    println("----------Until----------")
    for(i in 0 until 10){
        println("\t$i")
    }
    println("----------Until and Step----------")
    for(i in 0 until 10 step 2){
        println("\t$i")
    }
    println("----------downTo----------")
    for(i in 10 downTo  0){
        println("\t$i")
    }
    var total =0
    println("----------Sum of first 100 Natural Numbers----------")
    for(i in 1..100){
        total+=i
    }
    println("Total : $total")

    println("----------1 to 100 odd and even using While loop----------")
    var i=0
    print("Even Numbers : ")
    while(i<=100){
        print("\t$i")
        i+=2
    }
    i=1
    print("\nOdd Numbers : ")
    do {
        print("\t$i")
        i+=2
    }while (i<=100)
}