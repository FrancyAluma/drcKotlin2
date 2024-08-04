package TypesDeClasses

/* Ca s'appelle Classe singleton ou object...
 Ca n'utilises pas de companion object Et Ca n'a pas non plus besoin de constructeur ("()")

 Et on peut appeler les proprietes de la classe "object" dan une autre classe sans pour autant
 l'instancier, ca marchera toujours. exemple: ligne 40 et 56

 et C'est mieux de l'utiliser que la classe avec companion object...
 Et toutes ces donnees sont stockees dans une seule memoire
*/
fun main () {

    val bdo =BD
    val uIafficher = UIafficher(bd = bdo)
    val uIajouter = UIajouter(bd = bdo)

    uIafficher.rendreUI()
    uIajouter.rendreUI()
    uIafficher.rendreUI()


}

object BD {

    var typeBD = "Base de donnees des chaines de caracteres"
    var donnees = "Mira,Yannick,Chritian"
    fun ajouterDonnee(nouvauNom:String){

        donnees += ",$nouvauNom"
    }

}

class UIafficher(var titre: String = "AFFICHER DONNEES", var bd: BD){

    fun rendreUI () {
        println("""
            =============================================
            $titre
            ---------------
            ${bd.typeBD} // ou {BD.typeBD}, ca va marcher
            ${bd.donnees}
            =============================================
               
        """.trimIndent())
    }

}

class  UIajouter(var titre: String = "AJOUTER DONNEES", var bd: BD) {

    fun rendreUI (){
        println("""
            =================================================
            $titre
            ----------------
            ${BD.typeBD} ou {bd.typeBD}, ca va marcher
            Veuillez Saisir la nouvelle donnee: 
        """.trimIndent())
        var nouvelledonnee = readln()
        bd.ajouterDonnee(nouvelledonnee)
    }

}