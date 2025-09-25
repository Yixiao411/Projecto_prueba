import java.util.Scanner

fun main() {
    //Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de
    //pagar cada començal.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    print("El preu del sopar: ")
    var preuSopar = scanner.nextLine().toFloat()
    print("Quantitat de persones: ")
    var numPersones = scanner.nextLine().toFloat()

    //Valor final
    println(numPersones / preuSopar)
}