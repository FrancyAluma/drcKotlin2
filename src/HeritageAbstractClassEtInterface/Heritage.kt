package HeritageAbstractClassEtInterface

fun main () {

    val prof1 = Enseignant("Midipe",50)
    prof1.enseigner()

    println("--------------------")
    val elev1 = Eleve("Aluma",11)
    elev1.marcher()
    elev1.apprendre()


}

 open class Personne (nom: String , age:Int) {

     init {
         println("Nom :$nom  \nAge : $age ans")
     }

     open fun marcher () {
         println("Peux marcher")
     }

     protected fun parler (){
         println("Peux parler")
     } /* C'est pour dire que cette fonction ne peut etre utulise que par les fonctions filles de cette classe.
     Meme dans la fonction main tu ne peux pas l'utiliser
     */

 }

 class Enseignant(var nom: String,age: Int) : Personne(nom,age) {

     fun enseigner () {
         super.marcher()
         super.parler()
         println("Professeur $nom est entrain d'enseigner ")
     }

 }

class Eleve(nom: String, var age: Int) : Personne(nom,age) {

    fun apprendre () {
        super.parler()
        println("Cet eleve qui apprend a $age ans ")
    }

    override fun marcher() {
        super.marcher() // l'ancien ordre de marcher
        println("L'eleve marche")// le nouvel ordre de la fonction marcher
    }

}
