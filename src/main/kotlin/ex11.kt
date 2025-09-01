fun main() {
    println("Escolha uma operação matematica: ")
    println("[1]: Adição")
    println("[2]: Subtração")
    println("[3]: Multiplicação")
    println("[4]: Divisão")

    var opcao = readLine()?.toIntOrNull()

    if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 ){
        print("Selecione uma opção válida!")
        return
    }
    println("A opção selecioada foi $opcao")

    println("Digite o primeiro valor: ")
    var num1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo valor: ")
    var num2 = readLine()?.toDoubleOrNull()


    val resultado = when (opcao) {
        1 -> num1!! + num2!!
        2 -> num1!! - num2!!
        3 -> num1!! * num2!!
        4 -> num1!! / num2!!
        else -> null
    }

    println("O seultado da operação é: $resultado")
}

