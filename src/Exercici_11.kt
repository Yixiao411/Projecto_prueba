import java.util.Scanner

fun main() {
    //Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació.
    //Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    print("Introduix amplada de la sala: ")
    var ampladaSala = scanner.nextLine().toFloat()
    print("Introduix altrura de la sala: ")
    var alturaSala = scanner.nextLine().toFloat()
    print("Introduix profunditat de la sala: ")
    var profunditatSala = scanner.nextLine().toFloat()

    //Calcula el volum
    println(ampladaSala*alturaSala*profunditatSala)
}