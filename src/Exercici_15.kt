import java.util.Scanner

fun main() {
    //Fes un programa que afegeixi 1 segon un nombre de segons determinat.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toInt()
    if (numero1<59){
        numero1++
    }else{
        numero1 = 0
    }

    //segundo
    println(numero1)
}