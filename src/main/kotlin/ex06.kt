

//ex06
    //Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
    fun main()
    {
        var numero1: Int
        var numero2: Int
        var numero3: Int
        var numero4: Int

        println("Informe o primeiro valor: ")
        numero1 = readLine()!!.toInt()
        println("Informe o segundo valor: ")
        numero2 = readLine()!!.toInt()
        println("Informe o terceiro valor: ")
        numero3 = readLine()!!.toInt()
        println("Informe o quarto valor: ")
        numero4 = readLine()!!.toInt()

        println("O primeiro numero foi $numero1")
        println("O ultimo numero foi $numero4\n")

        if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
            println("O maior numero é: $numero1")
        } else if(numero2 > numero3 && numero2 > numero1 && numero2 > numero4){
            println("O maior numero é: $numero2")
        } else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
            println("O maior numero é: $numero3")
        }
        else if(numero4 > numero1 && numero4 > numero2 && numero4 > numero3){
            println("O maior numero é: $numero4")
        }
        else{
            println("Digite valores diferentes")
        }
    }