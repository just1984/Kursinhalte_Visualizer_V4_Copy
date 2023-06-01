

fun main(){
    println("Ah sie sind also ${altersEingabe()} Jahre alt")
}

// Nutzer Eingabe
fun altersEingabe(): Int {
    var alter: Int? = null

    while (alter == null) {
        try {
            println("Bitte geben sie ihr Alter ein:")
            alter = readln().toInt()

            if (alter < 0) {
                println("Alter muss positiv sein")
                alter = null
            }

        } catch (ex: Exception) {
            println("Fehlerhafte Eingabe! Versuchen sie es noch einmal")
        }
    }
    return alter
}