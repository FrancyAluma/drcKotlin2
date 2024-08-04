
fun main () {
    val ruz1 = Addition (5,7)
    ruz1.baam()
     println("-------------")

    val goo1 = Samba(7.0,9.0)
    goo1.appear()
    val goo2 = Samba(22.0 ,25.7)
    goo2.appear()
    println("-------------")

    val lopango1 = Kobatir(25.0,75.0)
    lopango1.lakisa()
    val lopango2 = Kobatir(72.0)
    lopango2.lakisa()

}

/* Dans le Constructeur Primaire ,
les variables sont definies comme parametres de la classe
 */
class Addition ( val chiff1: Int, val chiff2 : Int){

    fun boom() : Int {
        return chiff1+chiff2
    }

    fun baam () {

        println("L'addition de $chiff1 et $chiff2 est ${boom()}")
    }


}
//--------------------------------------------------

/* On peut ausi travailler avec le block "init"
Le BLOCK "init" permet d'executer un certain nombre d'Instructions
lors de chaque reaction d'un objet
 */
class Samba (num1: Double,num2: Double) {

    var nombre1 : Double
    var nombre2 : Double

    init {
        nombre1 = num1
        nombre2 = num2

        println("En Bas sera affichee l'addition de $nombre1 et $nombre2")
    }
    fun retour (): Double {

        return nombre1+nombre2
    }

    fun appear () {

        println("$nombre1 + $nombre2 = ${retour()}")
    }

}

/* Constructeur Secondaire
   ----------------------------
   Permet de reduire les parametres de la classe en une parametre
    */
class Kobatir (sev1:Double , sev2 : Double) {

    var brik = sev1
    var ciment = sev2
// On peut aussi appeler le block Unit, Ca ne pose pas de probleme
    constructor(mur:Double): this(mur,100.0)

    fun mapa() : Double {
        return brik/ciment
    }

    fun lakisa () {
        println("le Pourcentage est ${mapa()}")
    }

}
