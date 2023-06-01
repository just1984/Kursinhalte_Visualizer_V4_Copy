fun main() {

    var isUserNotLoggedIn = true
    var isUserLoggedIn = true
    var isUserOver18 = false

    if (isUserLoggedIn) {
        if (isUserOver18) {
            println("Zeige Alle Beiträge")
        } else {
            println("Zeige Beiträge für unter 18")
        }
    } else {
        println("Zeige Log In Screen")
    }

    if (isUserNotLoggedIn) {
        println("Zeige Log In Screen")
    } else if (isUserOver18) {
        println("Zeige alle Angebote")
    } else {
        println("Zeige Angebote für U18")
    }

    var month = 12

    when (month) {
        1 -> println("Januar")
        2 -> println("Februar")
        else -> println("Weder Januar noch Februar")
    }



}