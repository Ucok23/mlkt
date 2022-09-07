fun mean(values: List<Int>): Int {
    return values.sum() / values.size
}

fun variance(values: List<Int>, mean_val: Int) : Int {
    return values.sumOf { x -> (x - mean_val) * (x - mean_val) }
}

fun covariance(x: List<Int>, mean_x: Int, y: List<Int>, mean_y: Int): Float {
    var covar = 0.0F
    for (i in 0..x.size) {
        covar += (x[i] - mean_x) * (y[i] - mean_y)
    }
    return covar
}

fun main() {
    val d = listOf(1, 4, 2, 3, 5)
    println(mean(d))
    println(variance(d, mean(d)))
    covariance(d, 3, d, 2)
}