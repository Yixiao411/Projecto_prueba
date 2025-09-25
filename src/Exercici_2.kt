import java.util.Scanner

fun main() {
    //Escriu un programa que llegeixi un número per entrada i imprimeixi el doble del seu valor.
    val scan = Scanner(System.`in`)

    //llegir el valor
    var numero : Int = scan.nextInt()

    //imprimir doble de valor
    println(2*numero)
}