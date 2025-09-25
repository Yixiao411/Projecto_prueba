import java.util.Scanner

fun main() {
    //Fes un programa que rebi un caràcter i digui si és un nombre o no.
    var scanner = Scanner (System.`in`)
    var num = readln()
    var boolean = true

    if (num.single().isDigit()){
        boolean=true
        println(boolean)
    }else{
        boolean=false
        println(false)
    }

}