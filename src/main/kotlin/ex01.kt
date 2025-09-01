fun main(){
    var num1: Int
    var num2: Int

    println("Escreva um numero: ")
    num1 = readLine()!!.toInt()

    println("Escreva o segundo numero: ")
    num2 = readLine()!!.toInt()

    if (num1 > num2){
        println("O $num1 é o maior numero!")
    }else{
        println("O $num2 é o maior numero!")
    }
}
