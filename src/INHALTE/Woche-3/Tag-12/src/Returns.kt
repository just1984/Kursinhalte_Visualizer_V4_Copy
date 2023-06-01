

fun main(){
    // Mit Variablen
    val greeting: String = randomGreeting()
    val name = zufallsNamen()
    println(greeting + ", " + name)
    println("$greeting, $name")

    println("-----------")
    // Ohne variablen
    println(randomGreeting() + ", " + zufallsNamen())
    println(randomGreeting() + ", " + zufallsNamen())


    var fussballTeam = mutableListOf<String>(
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
        zufallsNamen(),
    )


    var umfang1 = kreisUmfang()
    println("Umfang1: $umfang1")    // Funktionen ohne Rückgabe werten geben "Kotlin.Unit"
    var umfang2 = kreisUmfangReturn()
    println("Umfang2: $umfang2")
}


fun doubleEinlesen(): Double {
    println("Geben sie einen Double Wert ein (z.B 13.4)")
    var eingabe = readln()
    return eingabe.toDouble()
}

fun kreisUmfangReturn(): Double {
    val pi = 3.1415

    println("Was ist der Radius des Kreises?")
    var radius = doubleEinlesen()
    var umfang = 2 * radius * pi

    return umfang
}



fun randomGreeting(): String {
    val listOfGreetings = listOf("Hallo", "Hola", "Bonjour", "Hello")
    val randomGreeting = listOfGreetings.random()
//    println(randomGreeting)
    return randomGreeting
}

fun zufallsNamen(): String {
    val vornamen = listOf("Andrej", "Marcel", "Francesco", "Artus")
    val nachnamen = listOf("Salih", "Gutke", "Alem")

    val ganzerName = "${vornamen.random()} ${nachnamen.random()}"

    return ganzerName
}



