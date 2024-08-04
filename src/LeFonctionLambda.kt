/*
Les Fonctions lambda permettent de passer aux parametres d'une fonction de premiere ordre directement
une expression..
Et C'est mieux de les utiliser que les foctions d'ordre superieur
 */

fun main () {
    var mutu1 = Batu()

    deBatu(mutu1) {
        println("le prenom est $it")
    }

    /*
    Ou on peut le faire comme ceci:

    deBatu (mutu1 , {

   var majuscule = it.uppercase()
   println(majuscule) : Ca va imprimer le prenom en majuscule => GEORGES

    }

     */


}

data class Batu (var nom: String = "Masebi", var prenom : String = "Georges")

fun deBatu ( mutu : Batu, bob : (String) ->Unit ) {
    bob(mutu.prenom)
}