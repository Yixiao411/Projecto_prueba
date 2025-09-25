import java.util.Scanner

fun main() {
    //Llegeix un valor amb decimals i imprimeix el doble.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toDouble()

    //Per la sortida sempre haureu d’imprimir un altre decimal amb el doble del valor del qual heu rebut per entrada.
    println(numero1 * 2)
}