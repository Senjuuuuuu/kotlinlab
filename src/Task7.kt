import kotlin.math.sqrt

fun sqr(n: Double): Double = n * n

fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    when {
        d < 0 -> println("Корней нет")
        d == 0.0 -> {
            val root = -b / (2 * a)
            println("Один корень: $root")
        }
        else -> {
            val sqrtD = sqrt(d)
            val x1 = (-b + sqrtD) / (2 * a)
            val x2 = (-b - sqrtD) / (2 * a)
            println("Два корня: x1 = $x1, x2 = $x2")
        }
    }
}

fun main() {
    println("Введите коэффициенты a, b, c:")
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    quadraticRoot(a, b, c)
}