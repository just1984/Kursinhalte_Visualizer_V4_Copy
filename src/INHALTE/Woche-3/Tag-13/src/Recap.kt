
fun main(){

    var zahlenReihe: IntRange = 1..10
    var zahlenListe: List<Int> = zahlenReihe.toList()

    zahlenReihe.random()
    zahlenListe.random()

    printRandomZahl()
    welcomeScreen()

    println()


    val name = zufallsNamen()
    val begruessung = randomGreeting()

    println("$begruessung, $name")
    println("test")


    var randomZahl = randomZahlInt()
    println(randomZahl)


}

fun welcomeScreen(){
    var begruessung: String = randomGreeting()
    var begruessung2: String = randomGreeting()
    var name = zufallsNamen()

    println("$begruessung, $name")
}


fun randomGreeting(): String {
    val listOfGreetings = listOf("Hallo", "Hola", "Bonjour", "Hello")
    val randomGreeting = listOfGreetings.random()

    return randomGreeting
    println(randomGreeting)     // Unereichbarer Code
}


fun zufallsNamen(): String {
    val vornamen = listOf("Andrej", "Marcel", "Francesco", "Artus")
    val nachnamen = listOf("Salih", "Gutke", "Alem")

    return "${vornamen.random()} ${nachnamen.random()}"
}

fun randomZahlInt(): Int{
    var zahlenListe: IntRange = (1..10)
    var zahl = zahlenListe.random()
    return zahl
}

fun printRandomZahl(){
    println(randomZahlInt())
}

fun randomZahlDouble(): Double{
    var zahlenListe = listOf(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    return zahlenListe.random()
}
