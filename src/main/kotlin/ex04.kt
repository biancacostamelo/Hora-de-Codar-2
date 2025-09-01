fun main(){
 //4. Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

    var num1: Int
    var num2: Int
    var num3: Int
    var soma: Int

    println("Digite um numero: ")
    num1 = readLine()!!.toInt()

    println("Digite o segundo numero: ")
    num2 = readLine()!!.toInt()

    println("Digite o terceiro numero: ")
    num3 = readLine()!!.toInt()

    if (num1 < num2 && num1 < num3){
        soma = num2 + num3
        print("A soma e: $soma")
    } else if (num2 < num3 && num2 < num1){
        soma = num1 + num3
        print("a soma e $soma")
    }else{
        soma = num1 + num2
        print("a soma e $soma")
    }
}