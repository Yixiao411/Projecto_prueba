import java.util.Scanner

fun main() {
    //Fes un programa que rebi un caràcter de l’abecedari en minúscula i un altre en majúscula i digui si són corresponents.
    var scanner = Scanner (System.`in`)
    var caracterMin : Char = scanner.next().single()
    var caracterMay : Char = scanner.next().single()

    //Transforma las mayuscules amb lowercaseChar() que nomes es per Char
    caracterMin = caracterMin.lowercaseChar()
    caracterMay = caracterMay.lowercaseChar()

    //Retorna true si son iguals i false en cas contrari
    if (caracterMin==caracterMay){
        println(true)
    }else{
        println(false)
    }
}