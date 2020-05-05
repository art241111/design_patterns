package prototype.shapes

class Rectangle: Shape{
    var width = 0
    var height = 0

    constructor():super(){}

    /**
     * Благодаря вызову родительского конструктор,
     * можно получить доступ к приватным полям конструктора
     */
    constructor(source:Rectangle):super(source){
        width = source.width
        height = source.height
    }

    /**
     * Метод позволяющий создать экземпляр класса с
     * данными, находящимеся в данном классе
     */
    override fun clone(): Shape {
        return Rectangle(this)
    }

    //TODO: Переименовать класс
    override fun isEquals(shape: Shape): Boolean {
        return if(shape is Rectangle){
                    (shape.width == width) &&
                    (shape.height == height) &&
                    (shape.x == super.x) &&
                    (shape.y == super.y) &&
                    (shape.color == super.color)
        }else false
    }


}