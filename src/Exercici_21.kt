import java.util.Scanner

fun main() {
    //Fes un programa que rebi dos nombres decimals i torni si són iguals o no
    val scanner = Scanner(System.`in`)

    //Llegeix el valor introduit
    var numero1 = scanner.nextLine().toFloat()
    var numero2 = scanner.nextLine().toFloat()
    var numero3 = scanner.nextLine().toFloat()
    var boolean : Boolean = true

    if (numero1==numero2&&numero2==numero3){
        println(boolean)
    }else{
        boolean=false
        println(boolean)
    }
}