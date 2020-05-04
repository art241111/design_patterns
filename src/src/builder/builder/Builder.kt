package builder.builder


/**
 * Интерфес строителя, который объявляет все возможные этапы и шаги
 * конфигурации продукта
 */
interface Builder {
    fun reset()
    fun setSeats(countSeats: Int)
    fun setEngine(engine: String)
    fun setTripComputer(isTripComputer: Boolean)
    fun setGPS(isGps: Boolean)
}