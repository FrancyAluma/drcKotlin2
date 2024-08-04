
fun main (){
val soso1 = Mongongo(50.0)
soso1.lakisa()
    val soso2 = Mongongo(37.9,25.6)
    soso2.lakisa()

    val soso3 = Mongongo(3.0,2.0)
    soso3.ciment = 0.0
    soso3.lakisa() // le calcul sera effectue sur 2.0

}

class Mongongo(sev1: Double, sev2: Double) {

    var brik : Double
    var ciment: Double = 0.0
        //Getters And Setters
    get() = field
        set(value) {
            if (value == 0.0) {
                println("Le denomiateur ne peut pas etre zero")
            } else{
            field = value
        }

        }

    init {
        brik = sev1
        ciment = sev2
    }


    constructor(mur:Double): this(mur,100.0)

   private fun mapa() : Double {
        return brik/ciment
    } // Cette fonction ne peut etre appelee dans une autre classe que la classe Mongongo

    fun lakisa () {
        println("le Pourcentage est ${mapa()}")
    }


}