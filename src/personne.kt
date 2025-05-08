class personne (var nom:String,var age:Int) {

    var email:String?=null
var prenom:String?=null
    get()=field?.capitalize() //modifie le getter en modifiant la premiere majuscule
    set(value){field="M.$value"}
    //costructeur secondaire
    constructor(nom:String,age:Int,email: String):this(nom,age){
        this.email=email
    }
//constructeur secondaire
    constructor(nom:String,prenom:String,age:Int):this(nom,age){
        this.prenom=prenom
    }

    fun afficherinfo(){
       println("nom : ${nom}")
        println("age : ${age}")
        if (email !=null){
            println("email ${email}")
        }
    }
}