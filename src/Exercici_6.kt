import java.util.Scanner

fun main() {
    //En una escola tenim tres classes i volem saber quin és el nombre de taules que necessitarem tenir en total. Dependrà del
    //nombre d'alumnes per aula. Cal tenir en compte que a cada taula hi caben 2 alumnes.

    //executa scanner
    val scan = Scanner(System.`in`)

    //llegir el valor
    var numero1 : Int = scan.nextInt()
    var numero2 : Int = scan.nextInt()
    var numero3 : Int = scan.nextInt()

    //imprimir taules necessaris
    println((numero1+numero2+numero3)/2)
}