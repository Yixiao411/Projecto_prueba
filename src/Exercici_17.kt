import java.util.Scanner

fun main() {
    //Fes un programa que rebi dos nombres enters i imprimeixi true si el primer és major que el segon, false en cap altre cas.
    val scanner = Scanner(System.`in`)

    //Llegeix el edad introduit
    print("Introdueix la edad: ")
    var edad : Int = scanner.nextLine().toInt()

    //Detector de edad
    if (edad>17){
        println("pasas")
    }else{
        println("no pasas")
    }

}