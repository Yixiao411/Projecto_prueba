import java.util.Scanner

fun main() {
    //Llegeix el diàmetre d'una pizza rodona i imprimeix la seva superfície. Pots usar Math.PI per escriure el valor de Pi.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    println("Introduce el diametro: ")
    var diametrePizza = scanner.nextLine().toDouble()

    //Superficie de la pizza
    println(Math.PI*((diametrePizza/2)*(diametrePizza/2)))
}