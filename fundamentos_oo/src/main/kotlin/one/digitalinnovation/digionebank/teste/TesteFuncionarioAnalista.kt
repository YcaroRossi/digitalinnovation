package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val joao = Analista("Joao Bispo", "123.123.123-45", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}