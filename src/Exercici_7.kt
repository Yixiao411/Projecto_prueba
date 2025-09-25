import java.util.Scanner

fun main() {
    //Escriu un programa que llegeixi un nombre enter i imprimeixi una frase amb el següent nombre enter.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toInt()

    //Suma el valor
    numero1 = numero1+1

    //Mostra el valor
    println("Després ve el " + numero1)
}