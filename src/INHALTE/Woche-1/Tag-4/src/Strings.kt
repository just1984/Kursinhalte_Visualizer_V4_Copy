

fun main(){
    // Farbcodes
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    val reset = "\u001B[0m"

    val vorname = "Gordon"
    val nachname = "Lucas"


    // Einfacher String (="Escaped String")
    var fullName = "$vorname $nachname" // oder: vorname + " " + nachname
    println(fullName)

    val geburtsJahr = 1980
    val alter = 2023 - geburtsJahr
    println("Alter: $alter")



    // Multi-Zeilen String (="Raw String")
    // statt "text" -> """ text """
    var boardingPass = """
        Vorname: ${red}$vorname ${reset}
        
    """.trimIndent()

    println(boardingPass)


    var gateOptionen = listOf('A', 'B', 'C')

    var gate: Char = gateOptionen.random()



}