fun main(){

    // Etwas 10-mal wiederholen:
    repeat(10){it ->
        print("${it + 1}: ")
        printHello()
    }


    // 20-mal den Gegner zufällig 1-5 mal angreifen lassen
    repeat(20) { it ->
        println("\nTest nr $it")
        repeat((1..5).random()) {
            println("Attacke")
        }
    }
}

fun printHello(){
    println("Hallo :)")
}