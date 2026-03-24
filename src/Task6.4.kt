fun main() {
    val array = arrayOf(2, 5, 1, 8, 3)

    val product = array.reduce { acc, element -> acc * element }
    val min = array.min()
    val max = array.max()

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}
