package builder.builder

import builder.products.Manual

/**
 * В отличии от других порождающих паттернов,
 * builder может создавать совершенно разные продукты
 */
class ManualBuilder: Builder {
    private var manual = Manual()

    /**
     * Пересоздаем builder
     */
    override fun reset() {
        manual = Manual()
    }

    /**
     * Устанавливае количество сидений
     * @param countSeats- количество сидений
     */
    override fun setSeats(countSeats: Int) {
        manual.descriptionCountSeats =
                "Количество сидений в этом автомобиле должно быть: $countSeats"
    }

    /**
     * Устанавливаем значение двигателя
     * @param engine - наименование двигателя
     */
    override fun setEngine(engine: String) {
        manual.descriptionTypeEngine = engine
    }


    /**
     * Указываем есть у автомобиля навигатор
     * или нет
     * @param isTripComputer - есть ли навигатор
     */
    override fun setTripComputer(isTripComputer: Boolean) {
        manual.descriptionTripComputer = isTripComputer
    }

    /**
     * Указываем есть у автомобиля gps
     * или нет
     * @param isGps - есть ли gps
     */
    override fun setGPS(isGps: Boolean) {
        manual.descriptionGps = isGps
    }

    /**
     * @return возващается мануал для
     * создания автомобиля
     */
    fun getResult():Manual {
        return manual
    }
}