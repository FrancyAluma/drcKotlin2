
fun main () {

    val q1 = Quotient()

    println(q1.numerateur)
/* Peut appeler toutes les variables ou fonctions de la classe Quotient parce qu'elle est liee
a cette Classe par la variable chike.
 */

    q1.afficher() // parce qu'elle est liee a sa classe en premier

}


class Quotient {

    var numerateur : Double = 12.0
    var denominateur : Double = 6.0

    fun operation () : Double {
        return numerateur/denominateur
         /* Ou on pouvait aussi creer un variable t retourner cette variable comme
         resultat.

         Ex: var result = numerateur/denominateur
         return result
          */
    }

    fun afficher () {

        println("Le resultat de la division du $numerateur par le $denominateur est ${operation()}")

    }

}