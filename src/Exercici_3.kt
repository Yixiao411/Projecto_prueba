import java.util.Scanner

fun main() {
    //Escriu un programa que donat dos números retorni la suma d’aquests.
    val scan = Scanner(System.`in`)

    //llegir el valor
    var numero1 : Int = scan.nextInt()
    var numero2 : Int = scan.nextInt()

    //imprimir suma de valor
    println(numero1+numero2)
}