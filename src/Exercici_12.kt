import java.util.Scanner

fun main() {
    //Feu un programa que rebi una temperatura en graus Celsius i la converteixi en graus Fahrenheit
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toFloat()

    //Temperatura
    println((numero1*1.8)+32)
}