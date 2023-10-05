import Figures.Classes.Circle
import Figures.Classes.Rect
import Figures.Classes.Square
import Figures.Enums.RotateDirection

fun main() {
    val splitString = "-".repeat(150)

    val rect = Rect(4, 3, 4f, 2f)
    println("Figure: ${rect}")
    println("Area: ${rect.area()}")

    rect.rotate(RotateDirection.CLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${rect}")

    rect.rotate(RotateDirection.COUNTERCLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mcounterclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${rect}")

    rect.rotate(RotateDirection.COUNTERCLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mcounterclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${rect}")

    rect.move(3, -3)
    println("\tThe figure after moving to the coordinates (x + 3, y - 3):\n\t\t${rect}")

    rect.resize(10)
    println("\tFigure after resizing by 10:\n\t\t${rect}")

    println("\tArea: ${rect.area()}")

    println(splitString)

    val square = Square(4f, 4, 2)
    println("Figure: ${square}")
    println("Area: ${square.area()}")

    square.rotate(RotateDirection.CLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${square}")

    square.rotate(RotateDirection.COUNTERCLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mcounterclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${square}")

    square.rotate(RotateDirection.COUNTERCLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mcounterclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${square}")

    square.move(3, -3)
    println("\tThe figure after moving to coordinates (x + 3, y - 3):\n\t\t${square}")

    square.resize(10)
    println("\tFigure after resizing by 10:\n\t\t${square}")

    println("\tArea: ${square.area()}")

    println(splitString)

    val circle = Circle(4f, 4, 2)
    println("Figure: ${circle}")
    println("Area: ${circle.area()}")

    circle.rotate(RotateDirection.CLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${circle}")

    circle.rotate(RotateDirection.COUNTERCLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mcounterclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${circle}")

    circle.rotate(RotateDirection.COUNTERCLOCKWISE, 3, -3)
    println("\tThe figure after turning \u001B[32mcounterclockwise\u001B[0m, with center coordinates (x: 3, y: -3):\n\t\t${circle}")

    circle.move(3, -3)
    println("\tThe figure after moving to coordinates (x + 3, y - 3):\n\t\t${circle}")
}