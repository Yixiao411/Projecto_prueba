import java.util.Scanner

fun main() {
    //Fes un programa que rebi un caràcter i digui si és una lletra o no.
    var scanner = Scanner (System.`in`)
    var caracter : Char = readln().single()
    var boolean = true

    if (caracter.isLetter()){
        boolean=true
        println(boolean)
    }else{
        boolean=false
        println(false)
    }

}