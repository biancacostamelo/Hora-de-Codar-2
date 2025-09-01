fun feminino(altura: Double){
    val pesoIdeal = (62.1 * altura) - 44.7
    println("O seu peso ideal é $pesoIdeal")
}

fun masculino(altura: Double){
    val pesoIdeal = (72.7 * altura) - 58
    println("O seu peso ideal é $pesoIdeal")
}

fun main(){
    println("Escreva sua altura: ")
    val altura = readLine()?.toDoubleOrNull()

    if (altura == null) {
        println("Altura inválida.")
        return
    }

    println("Selecione seu gerero")
    println("[1]: Feminino")
    println("[2]: Masculino")
    val genero = readLine()?.toIntOrNull()

    when(genero){
        1 -> feminino(altura)
        2 -> masculino(altura)
        else -> println("Opção inválida.")
    }
}

