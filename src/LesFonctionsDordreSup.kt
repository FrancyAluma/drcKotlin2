/*
Fonction d'ordre superieur(High order function):
C'est une fonction qui accepte une autre fonction comme parametre et
peut "renvoyer une autre fonction"
 */

fun main () {

    var personne1 = Personne ()
    dePersonne(personne1,:: recupererNom)// ici pcq recupererNom est fonction String et que foo est une fonction qui ->
    // est creee pour accepter une valeur String alors on l'a remplacee avec la fonction recupererNom


}

data class Personne (var nom:String= "Aluma", var prenom :String = "Francy")

fun dePersonne (personne: Personne , foo: (String) -> Unit) {
    foo(personne.nom)
}

fun recupererNom (nom : String){
    println("Mo nom est $nom")
}