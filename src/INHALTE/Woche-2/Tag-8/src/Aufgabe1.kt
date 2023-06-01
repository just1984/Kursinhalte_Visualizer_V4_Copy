
fun main(){

    var lieblingsEssen = mutableListOf("Pad Thai", "Pizza", "Käsespätzle")

    lieblingsEssen.add("Eiscreme")
    lieblingsEssen.add("Apfelkuchen")

    lieblingsEssen += listOf("Parmigiana", "Gnocci")
    lieblingsEssen += "Spaghetti"

    val erste = lieblingsEssen.removeAt(0)
    println(erste)

    println(lieblingsEssen.first())
    lieblingsEssen.removeFirst() // = lieblingsEssen.remove(lieblingsEssen.first())

}