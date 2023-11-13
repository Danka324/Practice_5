class Polygon(vararg points: Point) {
    private var points: Array<Point> = arrayOf()

    init
    {
        this.points = points as Array<Point>
    }

    fun moveX(ox: Int)
    {
        for (point in points)
        {
            point.moveX(ox)
        }
    }

    fun moveY(oy: Int)
    {
        for (point in points)
        {
            point.moveY(oy)
        }
    }

    fun moveXY(ox: Int, oy: Int)
    {
        for (point in points)
        {
            point.moveXY(ox, oy)
        }
    }

    override fun toString(): String
    {
        return "Многоугольник (points=${points.contentToString()})"
    }
}