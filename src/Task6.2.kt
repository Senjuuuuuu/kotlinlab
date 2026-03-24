fun main() {
    val array = arrayOf(2, 5, 1, 8, 3)

    var product = 1
    var min = array[0]
    var max = array[0]
    var i = 0

    while (i < array.size) {
        val element = array[i]
        product *= element
        if (element < min) min = element
        if (element > max) max = element
        i++
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}