import java.util.Scanner

fun main() {
    //Una web d'habitatges de lloguer ens ha proposat una ampliació. Volen mostrar l'àrea de les habitacions per llogar. Fes un
    //programa que ens ajudi a calcular les dimensions d'una habitació. Llegeix l'amplada i la llargada en metres (enters) i mostra'n
    //l'àrea.

    //executa scanner
    val scan = Scanner(System.`in`)

    //llegir el valor
    var numero1 : Int = scan.nextInt()
    var numero2 : Int = scan.nextInt()

    //imprimir area de valor
    println(numero1*numero2)
}