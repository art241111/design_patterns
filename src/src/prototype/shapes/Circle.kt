package prototype.shapes

/**
 * Класс circle - реализация класса Shape
 */
class Circle:Shape {
    var radius = 0

    constructor()

    /**
     * Благодаря вызову родительского конструктор,
     * можно получить доступ к приватным полям конструктора
     */
    constructor(source:Circle):super(source){
        radius = source.radius
    }

    /**
     * Метод позволяющий создать экземпляр класса с
     * данными, находящимеся в данном классе
     */
    override fun clone(): Shape {
        return Circle(this)
    }

    //TODO: Переименовать класс
    override fun isEquals(shape: Shape): Boolean {
        return if(shape is Circle){
            (shape.radius == radius) &&
                    (shape.x == super.x) &&
                    (shape.y == super.y) &&
                    (shape.color == super.color)
        }else false
    }

}