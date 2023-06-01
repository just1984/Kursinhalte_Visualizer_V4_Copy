import Kreise.kreisFlaeche
import Kreise.kreisUmfang

val PI: Double = 3.14159

fun main(){

    kreisUmfang()

    kreisFlaeche() // TODO: als Übung

    readln()
}


fun dreiBegruessung(){
    printGreeting()
    printGreeting()
    printGreeting()
}

// DRY:
// Dont Repeat Yourself = Wiederhole dich nicht
fun printGreeting(){
    println("Geben sie ihren Namen ein:")
    var name = readln()
    println("Hallo $name!")
}



