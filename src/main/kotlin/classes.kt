class Pessoa1

class Pessoa2 (var nome: String, var anoNascimento: Int)

class Pessoa3 (var nome: String) {

    var ano: Int? = null

   constructor(nome: String, ano: Int) : this(nome) {
       this.ano = ano
   }

    fun saudacao(){
        println("Olá, meu nome é $nome e nasci em $ano")
        println(ano)
    }
}

fun main(){


    val p2: Pessoa3 = Pessoa3(nome = "Amanda")
    val p1: Pessoa3 = Pessoa3("Rainer", 1989)

    p1.saudacao()
    p2.saudacao()

}