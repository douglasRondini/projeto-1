

fun main() {
    val listPerfume = getPerfume()

    val max30 = getMaxPerfume(listPerfume)
    val nomesMax30 = getNomesProdutos(max30)
    printText(nomesMax30)

    val min30 = getMinPerfume(listPerfume)
    val nomesMin30 = getNomesProdutos(min30)
    printText(nomesMin30)


}


//função responsavel por pegar a lista pronta la do servido!!
fun getPerfume(): List<Perfume>{
    return Servidor().getPerfumes()
}
// função para fazer a soma do meu estoque total !!!
fun sumEstoque(listPerfumes:List<Perfume>): Int {
    var toEstoque: Int = 0
    listPerfumes.forEach {
        toEstoque = toEstoque + it.qtd
    }
    return toEstoque
}
// função para criar uma lista com os Perfumes acima de 30 no estoque!!
fun getMaxPerfume(listPerfume: List<Perfume>) : List<Perfume> {
    val perfumeMax: MutableList<Perfume> = mutableListOf()
    listPerfume.forEach {
        if(it.qtd > 30){
            perfumeMax.add(it)
        }
    }
    return perfumeMax
}
//função para cria uma lista com os perfumes abaixo de 30 no estoque!!
fun getMinPerfume(listPerfume: List<Perfume>) : List<Perfume> {
    val perfumeMIn: MutableList<Perfume> = mutableListOf()
    listPerfume.forEach {
        if(it.qtd < 30){
            perfumeMIn.add(it)
        }

    }
    return perfumeMIn

}
//função responsavel por me retornar uma lista com os nomes dos perfumes da lista!
fun getNomesProdutos(listPerfume:List<Perfume>) : String {
    var nomes:String = ("")
    listPerfume.forEach {
        nomes = nomes + it.nome
    }
    return nomes
}
// função para imprimir minhas variaveis!!
fun printText(text:String){
    println(text)
}

