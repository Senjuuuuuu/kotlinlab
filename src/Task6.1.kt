fun main() {
    val array = arrayOf(2, 5, 1, 8, 3)

    var product = 1
    var min = array[0]
    var max = array[0]

    for (element in array) {
        product *= element
        if (element < min) min = element
        if (element > max) max = element
    }

    println("Произведение: $product")
    println("Минимум: $min")
    println("Максимум: $max")
}