class Pessoa1

class Pessoa2 (var nome: String, var anoNascimento: Int)

class Pessoa3 (var nome: String, var anoNascimento: Int) {
    fun saudacao(){
        println("olá, meu nome é $nome")
    }
}

fun main(){

    val pessoa: Pessoa3 = Pessoa3(nome = "Rainer", anoNascimento = 32)
    println(pessoa.nome)
    println(pessoa.anoNascimento)

    pessoa.saudacao()

}