import java.util.Scanner

fun main() {
    //Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de
    //pagar cada començal.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toFloat()
    var numero2 = scanner.nextLine().toFloat()

    //Valor final
    println(numero2 / numero1)
}