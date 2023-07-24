fun main() {
    val N1 = 10.0;
    val N2 = 3.0;
    var R: Double
    println("\n\t------------------Arithmetic Operators------------------")
    R = N1 + N2
    print("\n\tAddition = $R")
    //print("\n\tAddition = ${N1+N2}") <- these are String Templates

    R = N1 - N2
    print("\n\tAddition = $R")
    //print("\n\tSubtraction = ${N1-N2}")

    R = N1 * N2
    print("\n\tMultiplication = $R")
    //print("\n\tMultiplication = ${N1*N2}")

    R = N1 / N2
    print("\n\tDivision = $R")
    //print("\n\tDivision = ${N1/N2}")

    R = N1 % N2
    println("\n\tReminder = $R")
    //print("\n\tReminder = ${N1%N2}")

    println("\n\t------------------Comparison Operators------------------")
    // Here we compare two variables, It returns the output in boolean format "ture" ot "false"
    var Result: Boolean

    Result = N1 == N2
    print("\n\t N1 == N2 ? Ans = $Result")
    // or print("\n\t N1 == N2 ? Ans = ${N1 == N2}")

    Result = N1 != N2
    print("\n\t N1 != N2 ? Ans = $Result")
    // or print("\n\t N1 != N2 ? Ans = ${N1 != N2}")

    Result = N1 > N2
    print("\n\t N1 > N2 ? Ans = $Result")
    // or print("\n\t N1 > N2 ? Ans = ${N1 > N2}")

    Result = N1 < N2
    print("\n\t N1 < N2 ? Ans = " + Result)
    // or print("\n\t N1 < N2 ? Ans = ${N1 < N2}")

    Result = N1 >= N2
    print("\n\t N1 >= N2 ? Ans = $Result")
    // or print("\n\t N1 >= N2 ? Ans = ${N1 >= N2}")

    Result = N1 <= N2
    println("\n\t N1 <= N2 ? Ans = $Result")
    // or print("\n\t N1 <= N2 ? Ans = ${N1 <= N2}")

    println("\n\t------------------Assignment Operators------------------")
    R = 0.0 //Equal to operator
    R *= N1
    print("\n\t*= : $R")
    R += N1
    print("\n\t+= : $R")
    R %= N1
    println("\n\t%= : $R")

    println("\n\t------------------Assignment Operators------------------")
    print("\n\tPlus operator (R++) : ${R++}")
    //Nothing changes here because value of the variable is printed first and then it get incremented
    print("\n\there we can see the incremented by one : $R")
    print("\n\tPlus operator (++R) : ${++R}")
    print("\n\tMinus operator (R--) : ${R--}")
    //Nothing changes here al also, because value of the variable is printed first and then it get decremented
    print("\n\there we can see the incremented by one : $R")
    println("\n\tMinus operator (--R) : ${--R}")
}