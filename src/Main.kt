import java.util.Scanner

fun main() {
val scanner = Scanner(System.`in`)
    val contact=contact()
    while (true){
        println("1- ajouter contact :")
        println("2- afficher tous les contacts :")
        println("3- rechercher un contacts :")
        println("4- supprimer un contacts :")
        println("5- quitter :")

        val selection = scanner.nextInt()
        when (selection){
            1->ajouterContact(contact)
            2->afficherContact(contact)
            3->rechercherContact(contact)
            4->supprimerContact(contact)
            5->quitter()
        }
    }
}

fun quitter() {
    System.exit(0)
}

fun supprimerContact(contact: contact) {
    contact.supprimerContactPerson()
}

fun rechercherContact(contact: contact) {

    contact.rechercherContact()
}

fun afficherContact(contact: contact) {

    contact.afficherContactPerson()
}

fun ajouterContact(contact: contact) {

    contact.ajouterContactPersonn()
}





