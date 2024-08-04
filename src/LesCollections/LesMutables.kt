package LesCollections

fun main () {
    /* Les Collections Mutables sont ces collections dont on a acces a la lecture et a l'ecriture
    On ne peut ajouter Et retirer les elements
    On en a 3:
    1.Les Listes
    2.Les Sets
    3.Les Maps
     */
       println()
        //Les Listes
        println("LISTS----------------------------------------------------")
        val listePersonnes: MutableList<String> = mutableListOf()
        println(listePersonnes)
    listePersonnes.add("Francy")
    listePersonnes.add("Francy")
    listePersonnes.add("Bill")
    listePersonnes.add("Frank")
    listePersonnes.add("Yannick")
    listePersonnes.add("Elie")
    listePersonnes.add("Christian")
    listePersonnes.add("Steph")
    listePersonnes.add("Georges")
    println(listePersonnes)
    listePersonnes.remove("Steph")
    listePersonnes.removeAt(2)
        for(personne in listePersonnes) {
            println("Nom : $personne")
        }
        println()
        println("SETS------------------------------------------------------")
        // Les Sets :
        //Ne permet l'acces A des elements par des crochets et ne permets pas de doublons
        val listeDesPersonnes: MutableSet<String> = mutableSetOf()
        println(listeDesPersonnes)
    listeDesPersonnes.add("Francy")
    listeDesPersonnes.add("Francy")
    listeDesPersonnes.add("Francy")
    listeDesPersonnes.add("Mabia")
    listeDesPersonnes.add("Maikandi")
    listeDesPersonnes.add("Gucci")
    println(listeDesPersonnes)
        println(listeDesPersonnes.elementAt(1))
    listeDesPersonnes.remove("Gucci")
        for(person in listeDesPersonnes) {
            println("Nom : $person")
        }

        println()
        println("MAPS------------------------------------------------------")
        // Les Maps

        //dans Map<1.cle,2.valeur>
        var listeGens : MutableMap<String,String> = mutableMapOf("Nom 1" to "Mira", "Nom 2" to "Olga","Nom 3" to "Yannick")
        println(listeGens)
        println(listeGens["Nom 1"])
        listeGens["Nom 4"] = "Elie"
        listeGens.remove("Nom 2")
        for ((cle,valeur) in listeGens) {
            println("$cle : $valeur")
        }





}