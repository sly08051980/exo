import java.util.Scanner
import kotlin.random.Random

fun main() {
    val chiffreOrdinateur = Random.nextInt(1,101)
    val scanner = Scanner(System .`in`)
    var chiffre=0
    while (chiffre != chiffreOrdinateur){
        println("Choisir un chiffre : ")
        chiffre = scanner.nextInt()
        if (chiffre > chiffreOrdinateur){
            println("trop grand")

        }else if (chiffre<chiffreOrdinateur){
            println("trop petit")
        }else{
            println("correct")
        }
    }
}