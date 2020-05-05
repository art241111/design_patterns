package prototype.shapes

/**
 * Базовый класс Shape
 */
abstract class Shape {
    var x = 0
    var y = 0
    var color = "Red"

    /**
     * Базовый конструктор
     */
    constructor(){    }
    /**
     * Конструктор прототипа
     */
    constructor(source: Shape){
        this.x = source.x
        this.y = source.x
        this.color = source.color
    }

    /**
     * Результат клонировнаия всегда будет
     * объект из иерархии классов Shape
     */
    abstract fun clone():Shape
    abstract fun isEquals(shape:Shape):Boolean
}