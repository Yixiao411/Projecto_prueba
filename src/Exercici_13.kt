import java.util.Scanner

fun main() {
    //Escriu un programa que llegeixi un una temperatura i un augment d’aquest, el programa ha d’imprimir per pantalla quina és la
    //temperatura amb l’augment aplicat.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    print("La temperatura actual: ")
    var temperaturaActual = scanner.nextLine().toFloat()
    print("Quan augmenta? ")
    var temparaturaAugmentada = scanner.nextLine().toFloat()

    //Temperatura
    println("La temperatura actual es: " + (temperaturaActual + temparaturaAugmentada) + "º")
}