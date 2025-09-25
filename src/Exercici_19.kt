import java.util.Scanner

fun main() {
    //Fes un programa que rebi dos nombres enters i imprimeixi true si el primer és major que el segon, false en cap altre cas.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    print("Introdueix true o false: ")
    var boolean : Boolean = scanner.nextLine().toBoolean()

    //cambia el boolean al contrari
    if (boolean==true){
        boolean = false
        println(boolean)
    }else{
        println(boolean)
    }
}