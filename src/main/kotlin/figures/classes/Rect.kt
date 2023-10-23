package figures.classes

import figures.Enums.RotateDirection
import figures.Interfaces.Movable
import figures.Interfaces.Transforming

class Rect(var x: Int, var y: Int, var width: Float, var height: Float) : Movable, Transforming, Figure(0) {

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return width * height
    }

    override fun resize(zoom: Int) {
        width *= zoom
        height *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        if (centerX == x && centerY == y) return

        val (deltaX, deltaY) = if (direction == RotateDirection.COUNTERCLOCKWISE) {
            Pair(centerY - y, x - centerX)
        } else {
            Pair(y - centerY, centerX - x)
        }

        x = centerX + deltaX
        y = centerY + deltaY

        width = height.also { height = width }
    }


    override fun toString(): String {
        return "Rectangle (x: $x, y: $y) [width: $width, height: $height]"
    }
}
