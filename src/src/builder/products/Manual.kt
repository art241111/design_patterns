package builder.products

// Мануал для создания автомобиля
class Manual {
    var descriptionCountSeats = ""
    var descriptionTypeEngine = ""
    var descriptionTripComputer = false
    var descriptionGps = false

    override fun toString(): String {
        return "Количество сидений должно быть равно: ${descriptionTypeEngine} \n" +
                "Тип двигателя должен быть: ${descriptionTypeEngine} \n" +
                "Нужно ли устанавливать систему навигации: ${if (descriptionTripComputer) "Да" else "Нет"} \n" +
                "Нужно ли устанавливать GPS: ${if (descriptionGps) "Да" else "Нет"}"
    }
}