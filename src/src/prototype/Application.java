package prototype;

import prototype.shapes.Circle;
import prototype.shapes.Rectangle;
import prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Паттерн прототип позволяет копировать все
 * данные объекта, при этом не оставляя
 * зависимость от объекта родителя.
 * Для того, чтобы проверить данное утверждение,
 * В первом случае копия создается через присваивание,
 * во втором случае через прототип. С помо
 */
public class Application {
    /**
     * Данный метод стартовая точка приложения.
     * В нем создается главный список и
     * затем проводятся методы сравнения
     * списков.
     */
    public static void main(String[] args) {
        List<Shape> shapes = createListOfShapesWithTwoCircleAndOneRectangle();

        isCopyListEquals(shapes);
        System.out.println();
        isCloneListEquals(shapes);
    }

    /**
     * Метод для сравнения исходного массива и
     * массива, к которому присвоили исходный массив
     * @param shapes - исходный массив Shape
     */
    private static void isCopyListEquals(List<Shape> shapes){
        List<Shape> shapesCopy = shapes;

        System.out.print("Зависит ли код от копируемых объектов: ");
        System.out.println((shapes.equals(shapesCopy))?"Да":"Нет"); // Да

        System.out.print("Равны ли элементы массивов: ");
        System.out.println((isListEquals(shapes,shapesCopy))?"Да":"Нет"); // Да
    }

    /**
     * Метод для сравнения исходного массива и
     * массива, который создан с помощью
     * паттерна прототип
     * @param shapes - исходный массив
     */
    private static void isCloneListEquals(List<Shape> shapes){
        List<Shape> shapesCopy = copyList(shapes);

        System.out.print("Зависит ли код от копируемых объектов: ");
        System.out.println((shapes.equals(shapesCopy))?"Да":"Нет"); // Нет

        System.out.print("Равны ли элементы массивов: ");
        System.out.println((isListEquals(shapes,shapesCopy))?"Да":"Нет"); // Да
    }


    /**
     * Метлд для сравнения массивов по каждому элементу
     * @param shapes - первый массив для сравнения
     * @param shapesCopy - второй массив для сравнения
     * @return true - если массивы равны по элементам
     *         false - если массивы не равны по элементам
     */
    private static boolean isListEquals(List<Shape> shapes, List<Shape> shapesCopy) {
        for (int i = 0; i < shapes.size(); i++) {
            if(!shapes.get(i).isEquals(shapesCopy.get(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * Копирование массива по элементам
     * с помощью паттерна прототип
     * @param shapes - массив, который нужно скопировать
     * @return копия массива
     */
    private static List<Shape> copyList(List<Shape> shapes) {
        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape shape:shapes) {
            shapesCopy.add(shape.clone());
        }

        return shapesCopy;
    }

    /**
     * Заполнение списка: окружностью, копией окружностью и прямоугольником
     * @return заполненный массив
     */
    private static List<Shape> createListOfShapesWithTwoCircleAndOneRectangle(){
        List<Shape> shapes = new ArrayList<>();

        Circle circle = createCircle();
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = createRectangle();
        shapes.add(rectangle);

        return shapes;
    }


    /**
     * Создание окружности
     * @return объект класса Circle
     */
    private static Circle createCircle(){
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(10);
        return circle;
    }

    /**
     * Создание прямоугольника
     * @return объект класса Rectangle
     */
    private static Rectangle createRectangle(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(10);
        return rectangle;
    }
}
