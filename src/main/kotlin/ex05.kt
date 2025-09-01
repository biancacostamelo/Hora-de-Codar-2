fun main(){
    var n1: Int
    var n2: Int
    var n3: Int
    var n4: Int
    var n5: Int
    var n6: Int

    print("Digite o primeiro numero:")
    n1 = readLine()!!.toInt()

    print("Digite o segundo numero:")
    n2 = readLine()!!.toInt()

    print("Digite o terceiro numero:")
    n3 = readLine()!!.toInt()

    print("Digite o quarto numero:")
    n4 = readLine()!!.toInt()

    print("Digite o quinto numero:")
    n5 = readLine()!!.toInt()

    print("Digite o sexto numero:")
    n6 = readLine()!!.toInt()

    var soma = n1 + n2 + n3 + n4 + n5 + n6
    var media = soma / 6
    println("numeros digitados: $n1, $n2, $n3, $n4, $n5, $n6")
    print("a media dos numeros e $media")
}
