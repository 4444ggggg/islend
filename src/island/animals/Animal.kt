package island.animals

abstract class Animal(
    var weight: Double,
    val maxWeight: Double,
    val maxSpeed: Int,
    val maxFood: Double,
    val icon: String
) {
    var isAlive = true
    var currentFood = maxFood / 2

    abstract fun eat()
    abstract fun move()
    abstract fun reproduce()

    fun die() {
        isAlive = false
        println("$icon Умер...")
    }
}