class Pedidos() {
    var valorCompra = 0.0
        get() = field
        set(value) {
            field = value
        }
//    var tipoFrete: Boolean = false
//        get() = field
//        set(value) {
//            field = value
//        }

    fun freteNacional(valorCompra: Double): Double {
        var valorFrete = 0.0
        if (valorCompra > 75) {
            valorFrete = 0.0
        } else {
            valorFrete = valorCompra * 10 / 100
        }
        return valorFrete
    }

    fun freteInternacional(valorCompra: Double): Double {
        var valorFrete = (valorCompra * 15) /100
        if (valorFrete > 50) {
            valorFrete = 50.0
        }
        return valorFrete
    }
}

fun main(){
    var parada = 1;
    val pedido = Pedidos()

    while (parada == 1) {
        println("Calculo de frete")
        print("Informe o valor da compra: R$")
        val valor = readLine()!!.toDouble()
        pedido.valorCompra = valor
        print("True - Pedido Nacional | False - Pedido Internacional : ")
        val tipoPedido = readLine()!!.toBoolean()
        println("")
        if(tipoPedido) {
            println("O valor do frete, da sua compra nacional, é R$${pedido.freteNacional(pedido.valorCompra)}")
        } else {
            println("O valor do frete, da sua compra internacional, é R$${pedido.freteInternacional(pedido.valorCompra)}")
        }

        println("")
        println("Deseja fazer uma novo cálculo? \n 1 - Sim | 0 - Não : ")
        parada = readLine()!!.toInt()
    }


}