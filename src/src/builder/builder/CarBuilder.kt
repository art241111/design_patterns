package builder.builder

import builder.products.Car

/**
 * Каждый builder реализуют общий интерефейс по разному
 */
class CarBuilder:Builder {
    private var car = Car()

    /**
     * Пересоздаем builder
     */
    override fun reset() {
        car = Car()
    }

    /**
     * Устанавливае количество сидений
     * @param countSeats- количество сидений
     */
    override fun setSeats(countSeats: Int) {
        car.countSeats = countSeats
    }

    /**
     * Устанавливаем значение двигателя
     * @param engine - наименование двигателя
     */
    override fun setEngine(engine: String) {
        car.typeEngine = engine
    }


    /**
     * Указываем есть у автомобиля навигатор
     * или нет
     * @param isTripComputer - есть ли навигатор
     */
    override fun setTripComputer(isTripComputer: Boolean) {
        car.tripComputer = isTripComputer
    }

    /**
     * Указываем есть у автомобиля gps
     * или нет
     * @param isGps - есть ли gps
     */
    override fun setGPS(isGps: Boolean) {
        car.gps = isGps
    }

    /**
     * @return возващается автомобиль
     */
    fun getResult():Car {
         return car
    }

}