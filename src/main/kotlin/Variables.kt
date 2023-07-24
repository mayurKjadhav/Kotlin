fun main(){
    print("\n\t------------------var Variables------------------")
    var roll = 1001
    var name = "mayur"
    var marks = 97.89
    var pass = true
    print("\n\tRoll = "+roll)
    print("\n\tName = "+name)
    print("\n\tMarks = "+marks)
    print("\n\tPass = "+pass)

    print("\n\t------------------val Variables------------------")
    val Roll = 1002
    val Name = "Jadhav"
    val Marks = 99.89
    val Pass = true
    print("\n\tRoll = "+Roll)
    print("\n\tName = "+Name)
    print("\n\tMarks = "+Marks)
    print("\n\tPass = "+Pass)

    print("\n\t------------------Mod Variables------------------")
    roll = 1003
    print("\n\tRoll = "+roll)
    //Roll = 1004 <- this will give an error.
    //Because val variables cannot be reassigned.
}