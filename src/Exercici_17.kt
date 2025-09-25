import java.util.Scanner

fun main() {
    //Fes un programa que rebi dos nombres enters i imprimeixi true si el primer és major que el segon, false en cap altre cas.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 : Int = scanner.nextLine().toInt()

    if (numero1>17){
        println("pasas")
    }else{
        println("no pasas")
    }

}