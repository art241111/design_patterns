package builder.director

import builder.builder.Builder
/** Директор знает, в какой последовательности нужно заставлять
* работать строителя, чтобы получить ту или иную версию
* продукта. Заметьте, что директор работает со строителем через
* общий интерфейс, благодаря чему он не знает тип продукта,
* который изготовляет строитель
**/
class Director {
    /**
     * Последовательность и данные для создания
     * спортивного автомобиля
     */
    fun constructSportCar(builder: Builder){
        builder.reset()
        builder.setSeats(2)
        builder.setEngine("Sport")
        builder.setTripComputer(true)
        builder.setGPS(true)
    }
}
