fun main(){
    /*Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"*/
    var num: Double
    var i = 0
    var media: Double
    var soma = 0.0

    while(i < 4){
        println("Digite um numero de 1 a 10: ")
        num = readLine()!!.toDouble()

        if (num > 10 || num < 0){
            println("numero inválido!")
            return
        }else{
            soma = num + soma
        }
        i++
    }
    media = soma / 4
    print("A media dos numeros digitados é: $media")
}