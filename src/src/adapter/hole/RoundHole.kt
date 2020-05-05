package adapter.hole

import adapter.peg.RoundPeg

/**
 * Круглое отверстие
 */
class RoundHole(var radius: Double){
    fun fits(peg: RoundPeg):Boolean{
        return this.radius >= peg.getRadius()
    }
}