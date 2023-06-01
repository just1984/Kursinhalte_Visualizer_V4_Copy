
val userAccounts: MutableMap<String, String> = mutableMapOf(
    "Gordon" to "test123",
    "Jana" to "passwort321",
    "Eduard" to "boss1234",
    "Mario" to "LUiGI"
)

fun main(){
    println("Geben sie ihren Username ein:")
    val user = readln()

    var isUserLoggedIn: Boolean = passwortAbfrage(user)

    if (isUserLoggedIn){
        println("Hallo, $user")
    }

}

fun passwortAbfrage(userName: String, anzahlVersuche: Int = 1): Boolean{

    if (userName in userAccounts.keys && anzahlVersuche <= 3){ // in == userAccounts.contains(userName)
        val userPW: String = userAccounts[userName]!!

        println("Geben sie ihr Passwort ein: ")
        val pw = readln()

        if (pw == userPW){
            return true
        } else {
            return passwortAbfrage(userName, anzahlVersuche + 1)
        }
    }
    else {
        return false
    }
}
