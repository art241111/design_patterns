package builder;

import builder.builder.CarBuilder;
import builder.builder.ManualBuilder;
import builder.director.Director;
import builder.products.Car;
import builder.products.Manual;

/**
 * Директор получает конкретного строителя от клиента.
 * Приложение самое знает , какого строителя нужно использовать,
 * что получить определенный продукт.
 */
public class Application {
    /**
     * Создание и вывод информации об
     * автомобиле и мануале для его создания
     */
    public static void main(String[] args) {
        Director director = new Director();

        Car car = createCar(director);
        System.out.println("Характеристики автомобиля: \n" + car.toString());

        System.out.println();

        Manual manual = createManual(director);
        System.out.println("Мануал по сбору автомобиля: \n" + manual.toString());
    }

    /**
     * Сохдания машина с помощью директора
     * @param director - задается директор, в котором задана
     *                   последовательность действий, которые
     *                   требуются для создании объекта
     * @return возващается созданный car
     */
    private static Car createCar(Director director){
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        return carBuilder.getResult();
    }

    /**
     * Сохдания мануала с помощью директора
     * @param director - задается директор, в котором задана
     *                   последовательность действий, которые
     *                   требуются для создании объекта
     * @return возващается созданный manual
     */
    private static Manual createManual(Director director){
        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportCar(manualBuilder);
        return manualBuilder.getResult();
    }
}
