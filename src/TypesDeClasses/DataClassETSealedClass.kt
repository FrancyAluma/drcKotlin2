package TypesDeClasses

// dataClass : permet de contenir les donnees dans une meme memoire
/* C'est important aussi pour la destructuration des objects cad le fait d'extraire
certaines donnees d'un object

 */

fun main () {
/* Pour le dataclass:
----------------------
    var cours1 = Cours()
    var cours2 = Cours()
    var(designation) = cours1
    println(designation) // la destructuration
    println(cours1==cours2)
    println("${cours1.designation} ${cours1.duree}")
    println("${cours2.designation} ${cours2.duree}")
    println(cours1)
    println(cours2)
*/
    // Pour le sealedClass:

    var cours1 = Cours()
    val resultatOperation : EtatOperation = EtatOperation.Success(cours1,"C'est un Succes")
    when(resultatOperation) {
        is EtatOperation.Encours -> println(resultatOperation.message)
        is EtatOperation.Success-> println("${resultatOperation.message} \n${resultatOperation.cours.designation}")
        is EtatOperation.Echec -> println(resultatOperation.message)
    }

}

data class Cours(val designation:String = "Intoduction A Java", val duree: Int = 3)

/* SealedClass ou (fermee) : Aide A effectuer plusieurs operations dans des classes
qu'elle porte...

Elle est utilisee pour representer une hierarchie restrainte des classes qui peuvent prendre
plusieurs etats
 */

sealed class EtatOperation (val message:String) {

    class Encours(msg:String): EtatOperation(msg)
    class Success(val cours: Cours ,msg:String): EtatOperation(msg)
    class Echec(msg:String): EtatOperation(msg)
}
