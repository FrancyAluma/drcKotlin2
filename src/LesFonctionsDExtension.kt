/* Les Fonctions d'extension permettent d'etendre les membres d'un certain objet d'une
 certaine classe sans etre l'auteur de la classe

 */

fun main () {

    var kombo = Ecole()
    kombo.getEcoProf {
        println(it)
    }





}

data class Ecole (var nom: String = "Malula", var prof : String = "Kilolo")

fun Ecole.getEcoProf( lin: (String) -> Unit  ) {
    lin("L'ecole :${this.nom} Prof:${this.prof}")

}