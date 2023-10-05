package Figures.Classes

import Figures.Enums.RotateDirection
import Figures.Interfaces.Movable
import Figures.Interfaces.Transforming
import kotlin.math.PI
import kotlin.math.pow

class Circle(var radius: Float, var x: Int, var y: Int) : Movable, Transforming, Figure(0) {

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return PI.toFloat() * radius.pow(4);
    }

    override fun resize(zoom: Int) {
        radius *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        if (centerX == x && centerY == y) return
        val (signX, signY) = if (direction == RotateDirection.COUNTERCLOCKWISE) Pair(-1, 1) else Pair(1, -1)

        x = (signX * (y - centerY) + centerX).also {
            y = signY * (x - centerX) + centerY
        }
    }

    override fun toString(): String {
        return "Circle: ($x, $y) [radius: $radius]"
    }
}