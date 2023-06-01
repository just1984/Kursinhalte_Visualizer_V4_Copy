
fun main() {

    scheibenWischer()

}


fun regenSensor(): Boolean{
    return listOf(true, false).random()
}

fun scheibenWischer(){
    var isRaining: Boolean = regenSensor()
    if (isRaining) {
        // if-block  if-Anweisung
        println("Scheibenwischer an")
    } else {
        // else-block  else-Anweisung
        println("Scheibenwischer aus")
    }
}

fun regenJacke(){
    if (regenSensor())
        println("Regenjacke an") // Einzelne Anweisung brauchen keine { }
    else {
        println("Regenjacke aus")
        println("Sonnebrille mitnehmen")
    }
}


fun showHomeScreen(){
    println("Willkommen, User!")
}

fun showLoginScreen(){
    println("Login erfordert. Bitte einloggen!")
    println("Username:")
    readln()
    println("Passwort:")
    readln()
}

fun update(){
    var updateVerfuegbar = false
    var updateErfolgreich: Boolean? = false

    if (updateVerfuegbar) {
        updateErfolgreich = false
        println("System wird upgedated. Bitte warten")
        Thread.sleep(5000)
        println("Update abgeschlossen")
        updateErfolgreich = true
        updateVerfuegbar = true
    }

    println(updateErfolgreich)
}