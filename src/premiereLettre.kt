import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println(" combien de mot voulez vous saisir ?")
    val nombre = scanner.nextInt()
    val voyelle = listOf('a', 'e', 'i', 'o', 'u', 'y')
    var listeMot = mutableListOf<String>()

    for (item in 0 until nombre){
        println("mot ${item +1}")
        val mot = scanner.next()
        var premiereLettre = mot.first().lowercaseChar()

        if (premiereLettre in voyelle){
            listeMot.add(mot)
        }
    }
    println(listeMot.toList())
}