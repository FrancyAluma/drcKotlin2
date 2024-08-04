package TypesDeClasses
// ca permet d'assigner n'importe datatype a la classe ou fonction que tu utilises en mettant juste <> devant
fun main () {

    val ui = UI("Marco")
    ui.afficher()

    val ui2 = UI(1000)
    ui2.afficher()

    println("=====================")

    charlie(70000)
    charlie("Aluma")
    charlie(false)
}

class UI <T> (val donnee:T) {

    fun afficher() {

        println("$donnee")
    }
}

fun <T> charlie (gag : T) {
    println("Je suis charlie $gag")
}