package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ycaro"
    var cpf: String = "123.123.123-45"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val ycaro = Pessoa()

    println(ycaro.pessoaInfo())
}