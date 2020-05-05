package adapter

class RoundHole(var radius: Double){
    fun fits(peg:RoundPeg):Boolean{
        return this.radius >= peg.getRadius()
    }
}