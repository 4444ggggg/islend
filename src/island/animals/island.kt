package island

import island.animals.Animal

class Island(val width: Int = 10, val height: Int = 10) {
    // Карта острова: сетка из локаций
    private val grid = Array(width) { Array(height) { Location() } }

    // Добавляем животное в случайную локацию
    fun addAnimal(animal: Animal) {
        val x = (0 until width).random()
        val y = (0 until height).random()
        grid[x][y].animals.add(animal)
        println("${animal.icon} Добавлен в клетку ($x, $y)")
    }

    // Симуляция дня: все животные двигаются и едят
    fun simulateDay() {
        println("\n=== День на острове ===")
        for (x in 0 until width) {
            for (y in 0 until height) {
                grid[x][y].animals.forEach { animal ->
                    animal.move()
                    animal.eat()
                    if (animal.currentFood < 0) animal.die()
                }
            }
        }
    }
    fun printIsland() {
        println("\nКарта острова:")
        for (y in 0 until height) {
            for (x in 0 until width) {
                val animalsHere = grid[x][y].animals
                val icon = animalsHere.firstOrNull()?.icon ?: "・"
                print("$icon ")
            }
            println()
        }
    }
}

// Класс локации (клетка на острове)
class Location {
    val animals = mutableListOf<Animal>()
}

