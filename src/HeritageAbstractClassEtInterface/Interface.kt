package HeritageAbstractClassEtInterface

// Une classe fille interface peut heriter de plusieurs meres inteerfaces
// Toutes les fonctions d'une "interface class" doivent etre implimentees dans ses classes fille
//Les fonctions d'une "interface class" n'ont pas de corps

fun main () {
 val yaa = Yaya("Michee")
    yaa.droit()
    yaa.kolia()
    yaa.kolata()

    println("--------------")

    val leee = Muana("EGiDE")
    leee.devoir()
    leee.kolia()
    leee.kolata()


}

interface Batu {
    var nom : String
    fun kolia()
    fun kolata()
}




class Yaya(override var nom: String) : Batu {


    fun droit() {
        println("$nom donne des ordres")
    }

    override fun kolia() {
        println("Yaya azo lia")
    }

    override fun kolata() {
        println("Yaya azo lata")
    }

}

class Muana (override var nom: String): Batu {

    fun devoir() {
        println("$nom ecoute le Yaya")
    }

    override fun kolia() {
        println("Leki azo lia")
    }

    override fun kolata() {
        println("Leki azo lata")
    }
}