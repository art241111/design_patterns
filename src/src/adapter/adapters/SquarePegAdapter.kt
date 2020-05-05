package adapter.adapters

import adapter.peg.RoundPeg
import adapter.peg.SquarePeg
import kotlin.math.sqrt

/**
 * Адаптер позволяющий совместить
 * круглое отверстие с квадратным
 * колышком
 */
class SquarePegAdapter(): RoundPeg(){
    private lateinit var peg: SquarePeg

    constructor(peg: SquarePeg):this(){
        this.peg = peg
    }

    override fun getRadius():Double{
        return (peg.width * sqrt(2.0)/2).toInt().toDouble()
    }
}