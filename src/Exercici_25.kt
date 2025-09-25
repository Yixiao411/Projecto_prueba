import java.util.Scanner

fun main() {
    //Fes un programa que rebi un caràcter de l’abecedari en majúscula i el faci minúscula.
    var scanner = Scanner (System.`in`)
    var caracter : Char = scanner.next().single()

    //Transforma la minuscola a mayuscula nomes en la sortida
    println(caracter.uppercase())
}