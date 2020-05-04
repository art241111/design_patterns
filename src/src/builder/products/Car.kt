package builder.products

// "Железный" автомобиль
class Car {
    var countSeats = 0
    var typeEngine = ""
    var tripComputer = false
    var gps = false

    override fun toString(): String {
        return "Количество сидений: $countSeats \n" +
                "Тип двигателя: $typeEngine \n" +
                "Есть ли система навигации: ${if (tripComputer) "Есть" else "Отсутствует"} \n" +
                "Есть ли GPS: ${if (gps) "Есть" else "Отсутствует"}"
    }
}