fun main(){
    /*9. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).*/

    var ano: Int

    println("Digite o ano que você nasceu: ")
    ano = readLine()!!.toInt()

    if(2025 - ano >= 16){
        println("pode votar")
    }else(
        println("nao pode votar")
    )
}