import java.util.Scanner

fun main() {
    //Llegeix el preu original i el preu actual i imprimeix el descompte (en %).
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    println("Introduce el precio original: ")
    var numero1 = scanner.nextLine().toDouble()
    println("Introduce el precio actual: ")
    var numero2 = scanner.nextLine().toDouble()
    var diferencia : Double
    diferencia = numero1-numero2

    //Per la sortida sempre haureu d’imprimir un altre decimal amb el valor del descompte representat en %.
    println(diferencia/numero1*100)
}