package LesCollections

/* Les Collections immutables sont ces collections dont on a juste acces a la lecture
On ne peut ni ajouter ni retirer les elements
On en a 3:
1.Les Listes
2.Les Sets
3.Les Maps
 */

fun main () {

    println()
    //Les Listes
    println("LISTS----------------------------------------------------")
    val listePersonnes: List<String> = listOf("Pauline","Francy","Steph","Georges","Pauline")
    println(listePersonnes)
    println(listePersonnes[2])
    for(personne in listePersonnes) {
        println("Nom : $personne")
    }
    println()
    println("SETS------------------------------------------------------")
    // Les Sets :
    //Ne permet l'acces A des elements par des crochets et ne permets pas de doublons
    val listeDesPersonnes: Set<String> = setOf("Pauline","Francy","Steph","Georges","Pauline")
    println(listeDesPersonnes)
    println(listeDesPersonnes.elementAt(1))
    for(person in listeDesPersonnes) {
        println("Nom : $person")
    }

    println()
    println("MAPS------------------------------------------------------")
    // Les Maps

    //dans Map<1.cle,2.valeur>
    var listeGens : Map<String,String> = mapOf("Nom 1" to "Mira", "Nom 2" to "Olga","Nom 3" to "Yannick")
    println(listeGens)
    println(listeGens["Nom 1"])
    for ((cle,valeur) in listeGens) {
        println("$cle : $valeur")
    }

}