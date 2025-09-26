import java.util.Scanner

fun main() {
    //Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de
    //pagar cada començal.
    val scanner = Scanner(System.`in`)

    //Crear el variable per preu de sopar i les persones que van asistir
    //Llegeix els valors introduit
    print("El preu del sopar: ")
    var preuSopar = scanner.nextLine().toFloat()
    print("Quantitat de persones: ")
    var numPersones = scanner.nextLine().toFloat()

    //Calcula el preuFinal
    var preuFinal = numPersones / preuSopar

    //Valor final
    println("Cadascu ha de pagar: $preuFinal")
}