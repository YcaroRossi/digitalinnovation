package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ycaro"
    var cpf: String = "123.123.123-45"
}

fun main() {
    val ycaro = Pessoa()

    println(ycaro.nome)
    println(ycaro.cpf)
}