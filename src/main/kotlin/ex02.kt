fun main(){
    var num1: Int

    println("Digite um numero:")
    num1 = readLine()!!.toInt()

    if (num1 == 0){
        println("o numero é igual a zero!")
    }else if(num1 > 0){
        print("o numero é positivo")
    }else{
        print("o numero é negativo")
    }
}