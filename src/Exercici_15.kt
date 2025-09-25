import java.util.Scanner

fun main() {
    //Fes un programa que afegeixi 1 segon un nombre de segons determinat.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    print("Introdueix els segons: ")
    var segonsIntroduit = scanner.nextLine().toInt()

    //Reinicia el contador
    if (segonsIntroduit<59){
        segonsIntroduit++
    }else{
        segonsIntroduit = 0
    }

    //Segons actuals
    println(segonsIntroduit)
}