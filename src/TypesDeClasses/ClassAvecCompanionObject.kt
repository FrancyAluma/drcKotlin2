package TypesDeClasses

/*
Le COMPANION OBJECT aide a pouvoir utiliser les proprietes d'une classe dans une autre classe sans pour
autant avoir a l'instancier ou a creer un object de cette classe autre part

 */
fun main () {

    val cbo =BDI()
    val uIaffichere = UIaffichere(bd = cbo)
    val uIajoutere = UIajoutere(bd = cbo)

    uIaffichere.rendreUI()
    uIajoutere.rendreUI()
    uIaffichere.rendreUI()


}

class BDI {

    var donnees = "Mira,Yannick,Chritian"
    fun ajouterDonnee(nouvauNom:String){

        donnees += ",$nouvauNom"
    }

    companion object {
        var typeBD = "Base de donnees des chaines de caracteres"
    }

}

class UIaffichere (var titre: String = "AFFICHER DONNEES", var bd:BDI){

    fun rendreUI () {
        println("""
            =============================================
            $titre
            ---------------
            ${BDI.typeBD} // effet du companion object
            ${bd.donnees}
            =============================================
               
        """.trimIndent())
    }

}

class  UIajoutere (var titre: String = "AJOUTER DONNEES", var bd: BDI ) {

    fun rendreUI (){
        println("""
            =================================================
            $titre
            ----------------
            ${BDI.typeBD} // effet du companion object
            Veuillez Saisir la nouvelle donnee: 
        """.trimIndent())
        var nouvelledonnee = readln()
        bd.ajouterDonnee(nouvelledonnee)
    }

}