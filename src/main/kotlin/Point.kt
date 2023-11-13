open class Point {
    var x = 0
    var y= 0

    constructor(x: Int, y: Int)
    {
        this.x = x
        this.y = y
    }

    //перемещения х
    fun moveX(ox: Int)
    {
        x += ox
    }
    //перемещения у
    fun moveY(oy: Int)
    {
        y += oy
    }
    //перемещения хy
    fun moveXY(ox: Int, oy: Int)
    {
        x += ox
        y += oy
    }
    override fun toString(): String
    {
        return "Точка(x=$x, y=$y)"
    }
}