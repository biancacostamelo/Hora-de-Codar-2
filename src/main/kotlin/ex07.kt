fun main(){
    /*7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada também todos valores que o usuário informou.*/

    var soma = 0
    var numero: Int
    var i = 0

    while (i < 6){
        print("digite um numero: ")
        numero = readLine()!!.toInt()

        if (numero <= 72){
            soma = numero + soma
        }
        i++
    }
    print("A soma dos numeros inferiores a 72 e: $soma")
}