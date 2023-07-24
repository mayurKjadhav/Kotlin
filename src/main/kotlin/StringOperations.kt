fun main(){
    println("\n\t----------String Functions using String Templates-----------")
    val str  = "Welcome to my world"
    println("\n\tString is $str \n\tLength of the string is ${str.length} \n\tElement at index 10 is ${str.get(10)}" +
            " \n\tPart of String from 8th index to 13th index is ${str.subSequence(8,13)}")
    //Some important functions of string
    // 1) str.length() : This function returns the length of the string <Note: Index starts from 0 onwards>
    // 2) str.get(index) : Get function give the particular element at the exact index.
    // 3) str.subSequence() : This Function gives the exact part of the string beginning from given start index and end index.
}