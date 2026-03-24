class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double = kotlin.math.sqrt(x * x + y * y + z * z)

    fun dot(other: Vector): Double = x * other.x + y * other.y + z * other.z

    infix fun scalar(other: Vector): Double = dot(other)

    operator fun times(other: Vector): Double = dot(other)
}

fun scalarProduct(v1: Vector, v2: Vector): Double = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Длина v1: ${v1.length()}")
    println("Скалярное произведение через метод: ${v1.dot(v2)}")
    println("Инфиксная запись: ${v1 scalar v2}")
    println("Оператор * : ${v1 * v2}")
    println("Внешняя функция: ${scalarProduct(v1, v2)}")
}