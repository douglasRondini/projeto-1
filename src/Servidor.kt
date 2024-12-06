 class Servidor {
    fun getPerfumes(): List<Perfume> {
        val perf1 = Perfume("kayak", 15, "amadeirado")
        val perf2 = Perfume("musk", 25, "adocicado")
        val perf3 = Perfume("homem", 33, "amadeirado")
        val perf4 = Perfume("omini", 45, "amadeirado")

        val listPerfumes: MutableList<Perfume> = mutableListOf()
        listPerfumes.add(perf1)
        listPerfumes.add(perf2)
        listPerfumes.add(perf3)
        listPerfumes.add(perf4)

        return listPerfumes
    }
}
 class Perfume(
    val nome: String,
    val qtd: Int,
    val fragancia: String
)