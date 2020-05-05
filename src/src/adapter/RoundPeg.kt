package adapter

open class RoundPeg(){
    private var radius = 1.0

    constructor(radius:Double):this(){
        this.radius = radius
    }

    open fun getRadius():Double{
        return radius
    }
}