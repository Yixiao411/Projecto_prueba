import java.util.Scanner

fun main() {
    //Fes un programa que rebi un caràcter de l’abecedari en minúscula i un altre en majúscula i digui si són corresponents.
    var scanner = Scanner (System.`in`)
    var caracter : Char = scanner.next().single()

    //Transforma la mayuscula en la minuscula nomes en la sortida
    println(caracter.lowercase())
}