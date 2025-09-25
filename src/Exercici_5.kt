import java.util.Scanner

fun main() {
    //L'usuari escriu 4 enters i s'imprimeix el valor de sumar el primer amb el segon, multiplicat per el mòdul del tercer amb el quart.

    //executa scanner
    val scan = Scanner(System.`in`)

    //llegir el valor
    var numero1 : Int = scan.nextInt()
    var numero2 : Int = scan.nextInt()
    var numero3 : Int = scan.nextInt()
    var numero4 : Int = scan.nextInt()

    //imprimir el valor
    println((numero1+numero2)*(numero3%numero4))
}