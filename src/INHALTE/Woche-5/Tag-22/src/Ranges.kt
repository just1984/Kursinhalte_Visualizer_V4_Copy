
// import kotlin.ranges // wird eh immer importiert

fun main(){
    var wuerfel = (1..6).random()

    val a: IntRange = 1..10
    
    println("a: $a")
    println("a: ${a.toList()}")

    val b: IntProgression = 1 ..10 step 3
    println("b: $b")
    println("b: ${b.toList()}")
    println("b[2]: ${b.elementAt(2)}")

    println("-----------------")

    val alphabet: CharRange = 'a'..'z'

    var test = 'A'..'z'

    println("Test 1: ")
    for(buchstabe in test){
        if (buchstabe.isLetter())
            println(buchstabe)
    }

    println("-----------------")
    println("Test 2: ")

    test = '!' .. ';'
    for(buchstabe in test){
        println(buchstabe)
    }
    
}