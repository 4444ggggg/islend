import island.Island
import island.animals.*

fun main() {
    println("=== 🌴 СИМУЛЯЦИЯ ОСТРОВА ===")

    val island = Island(width = 5, height = 5)  // Маленький остров для наглядности

    // Добавляем животных
    island.addAnimal(Wolf())
    island.addAnimal(Rabbit())
    island.addAnimal(Bear())
    island.addAnimal(Rabbit())

    // Запускаем симуляцию
    island.simulateDay()
    island.printIsland()  // Добавьте эту строку
}