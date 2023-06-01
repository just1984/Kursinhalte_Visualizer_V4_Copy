fun main() {

    var numbers: List<Double> = listOf(
        0.0,
        1.0,
        1.0,
        2.0,
        3.0
    )
    var index = 0
    while(index < numbers.size){
        var number = numbers[index]
        println(number)
        index++
    }

    for (number in numbers){
        println(number)
    }

    for (i in numbers.indices){
        println(i)
    }

    // println(i)       //


    // Beispiel mit String
    var text = "Hi, my name is slim shady"
    var suchBuchstabe = 's'
    var counter = 0
    for (buchstabe in text){
        if (buchstabe == suchBuchstabe){
            counter ++
        }
    }
    println("Wie oft kommt '$suchBuchstabe' im Text vor: $counter")

    // Macht dasselbe wie:
    counter = text.count{ buchstabe -> buchstabe == suchBuchstabe}
    println("Wie oft kommt '$suchBuchstabe' im Text vor: $counter")


    /* Andere nützliche String & Listen Funktionen
        All diese Funktionen implementieren eine For-Schleife über die Liste / den String

        .forEach
        .forEachIndexed
        .count
        .filter
        .removeIf
        .groupBy
        .first
        .last

        ... uvm

     */


    // Beispiel mit 1x1
    // Aufpassen es passieren 10x10=100 durchläufe
    println("\n das 1x1")
    for (i in 1..10){
        for (j in 1..10){
            println("$i * $j = ${i*j}")
        }
    }

    // Jedes Schachfeld im Schachbrett
    for (i in 'A'..'H'){
        for (j in 1..8){
            print("")
        }
    }



}