fun main() {
    println("=== 🌴 СИМУЛЯЦИЯ ОСТРОВА ===")
    val wolf = island.animals.Wolf()

    wolf.eat()
    wolf.move()

    println("\nИтог:")
    println("${wolf.icon} Сытость: ${wolf.currentFood}/${wolf.maxFood}")
}