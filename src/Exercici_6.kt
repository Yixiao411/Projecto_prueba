import java.util.Scanner

fun main() {
    //En una escola tenim tres classes i volem saber quin és el nombre de taules que necessitarem tenir en total. Dependrà del
    //nombre d'alumnes per aula. Cal tenir en compte que a cada taula hi caben 2 alumnes.

    //executa scanner
    val scan = Scanner(System.`in`)

    //llegir els alumnes de les clases
    var alumnoClase1 : Int = scan.nextInt()
    var alumnoClase2 : Int = scan.nextInt()
    var alumnoClase3 : Int = scan.nextInt()

    //Calcula els pupitres de cada clase
    var pupitresClase1 : Int = alumnoClase1/2 + alumnoClase1%2
    var pupitresClase2 : Int = alumnoClase2/2 + alumnoClase2%2
    var pupitresClase3 : Int = alumnoClase3/2 + alumnoClase3%2

    //Calcula els pupitres que necesitem en total
    var numPupitres : Int = pupitresClase1 + pupitresClase2 + pupitresClase3

    //imprimir taules necessaris
    println(numPupitres)
}