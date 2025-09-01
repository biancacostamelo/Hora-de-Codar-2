fun main() {
    var num1: Int
    var num2: Int
    var num3: Int

    println("Digite um numero: ")
    num1 = readLine()!!.toInt()

    println("Digite o segundo numero: ")
    num2 = readLine()!!.toInt()

    println("Digite o terceiro numero: ")
    num3 = readLine()!!.toInt()

    if (num1 == num2 && num2 == num3){
        print("escreva numeros diferentes!")
        return
    }

    if (num1 > num2 && num1 > num3){
        println("O numero $num1 e o maior")
    }else if(num2 > num1 && num2 > num3){
        println("o numero $num2 e meior")
    }else{
        print("o numero $num3 e o maior")
    }
}