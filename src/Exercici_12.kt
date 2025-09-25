import java.util.Scanner

fun main() {
    //Feu un programa que rebi una temperatura en graus Celsius i la converteixi en graus Fahrenheit
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    print("Introdueix la temperatua en Celcius: ")
    var tempCelcius = scanner.nextLine().toFloat()

    //Convercio de temperatura
    println("La temperatura en Fahrenehit és: " + (tempCelcius*1.8)+32)
}