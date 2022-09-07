fun mean(values: List<Int>): Int {
    return values.sum() / values.size
}

fun variance(values: List<Int>, mean_val: Int) : Int {
    return values.sumOf { x -> (x - mean_val) * (x - mean_val) }
}

fun main() {
    val d = listOf(1, 4, 2, 3, 5)
    println(mean(d))
    println(variance(d, mean(d)))
}