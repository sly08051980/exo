import java.util.Arrays
import java.util.Scanner



fun main()
{
    val scanner= Scanner(System.`in`)

    println("nombre de prenom a insérer ?")
    val nombrePrenom = scanner.nextInt()
    var tableau= arrayOfNulls<String>(nombrePrenom)
    for (nombre in 0 until nombrePrenom){
        println("Prenom ${nombre +1}")
        tableau[nombre]= scanner.next()

    }
    println(tableau.toList())
    for (prenom in tableau) {
        if (prenom != null && prenom.length > 5) {
            println("Prénom avec plus de 5 lettres : $prenom")
        }
    }


}