package adapter

import kotlin.math.sqrt

class SquarePegAdapter():RoundPeg(){
    private lateinit var peg: SquarePeg

    constructor(peg: SquarePeg):this(){
        this.peg = peg
    }

    override fun getRadius():Double{
        return (peg.width * sqrt(2.0)/2).toInt().toDouble()
    }
}