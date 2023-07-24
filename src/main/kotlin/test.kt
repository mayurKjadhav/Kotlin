
fun main() {
    val validUser = arrayOf("Oggy", "Jack", "Zaplu", "Taplu", "Paplu", "Olivia", "Bob")
    val userNames = arrayOf("jack", "Jack", "Zaplu", "Taplu", "Paplu", "Olivia", "Bob")
    var user: String ="avangers"

    if (validUser.contains("Olivia")) {
        for (i in 0..validUser.size-1) {
            if ("Olivia" == validUser[i]) {
                user = userNames[i]
            }
        }
        print(user)
    }
}