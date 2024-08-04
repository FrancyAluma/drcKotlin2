package HeritageAbstractClassEtInterface
// Une Abstract Classe est une classe qui ne peut pas creer d'objects ou d'instance
/* Et une abstract function d'une classe mere doit etre heretee a toutes ces classes filles.
Et une fonction abstract n'a pas de corps
 */
//Et une classe fille ne peut heriter que d'une mere

fun main () {

    val monsieur1 = Enseignaant("Midipe",50)
    monsieur1.enseigner()
    monsieur1.marcher()

    println("--------------------")
    val enfant1 = Elevee("Aluma",11)
    enfant1.apprendre()
    enfant1.marcher()



}

abstract class Personnee (nom: String , age:Int) {

    init {
        println("Nom :$nom  \nAge : $age ans")
    }

    abstract fun marcher ()

    protected fun parler (){
        println("Peux parler")
    } /* C'est pour dire que cette fonction ne peut etre utulise que par les fonctions filles de cette classe.
     Meme dans la fonction main tu ne peux pas l'utiliser
     */

}

class Enseignaant(var nom: String,age: Int) : Personnee(nom,age) {

    fun enseigner () {
        super.parler()
        println("Professeur $nom est entrain d'enseigner ")
    }

    override fun marcher() {
      println(" Mr.$nom marche parfaitement")
    }

}

class Elevee(nom: String, var age: Int) : Personnee(nom,age) {

    fun apprendre () {
        super.parler()
        println("Cet eleve qui apprend a $age ans ")
    }

    override fun marcher() {
        println("L'eleve marche correctement")
    }

}




