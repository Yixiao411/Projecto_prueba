import java.util.Scanner

fun main() {
    //Fes un programa que rebi dos nombres enters i imprimeixi true si el primer és major que el segon, false en cap altre cas.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 : Int = scanner.nextLine().toInt()
    var numero2 : Int = scanner.nextLine().toInt()
    var boolean : Boolean = true

    if (numero1>numero2){
        println(boolean)
    }else{
        boolean = false
        println(boolean)
    }

}