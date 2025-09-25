import java.util.Scanner

fun main() {
    //Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació.
    //Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toFloat()
    var numero2 = scanner.nextLine().toFloat()
    var numero3 = scanner.nextLine().toFloat()

    //Vloumen
    println(numero1*numero2*numero3)
}