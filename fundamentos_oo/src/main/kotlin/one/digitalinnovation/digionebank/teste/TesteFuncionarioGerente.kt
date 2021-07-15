package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Marques", "123.123.123-45", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}