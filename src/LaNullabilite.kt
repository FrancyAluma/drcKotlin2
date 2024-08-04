
fun main () {

    var nom : String? = null
    println(nom)

    var name : String? = null
    name.let {
        println(it)
    }

    var voldie : String?= "GoGoGo"
    voldie.let {
        println(it)
    }

    println("================================================================")

    var nume : String? = null
    println(nume?.length ?:"Kocoumbo")


}