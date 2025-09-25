import java.util.Scanner

fun main() {
    //Fes un programa que rebi el valor del nivell de riure de 5 persones i comprovi si la dita és certa.
    val scanner = Scanner(System.`in`)

    //Per la sortida sempre haureu d’imprimir un booleà a true si i només si el nivell de riure de l’última persona és més gran que el de
    //les anteriors i un booleà a false en qualsevol altre cas.
    var numero1 = scanner.nextInt()
    var numeroMax = numero1
    var i  = 0
    var boolean = true

    while (i < 4){
        i++
        if (numeroMax<numero1){
            numeroMax = numero1
        }
        numero1 = scanner.nextInt()
    }

    if (numero1>numeroMax){
        boolean = true
        println(boolean)

    }else{
        boolean = false
        println(boolean)
    }
}