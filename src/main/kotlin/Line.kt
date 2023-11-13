open class Line(start: Point, end: Point)
{
    var start: Point = start
    var end: Point = end

    constructor(x1: Int, y1: Int, x2: Int, y2: Int) : this(Point(x1, y1), Point(x2, y2))

    fun getStartPoint(): Point
    {
        return start
    }

    fun setStartPoint(start: Point)
    {
        this.start = start
    }

    fun getEndPoint(): Point
    {
        return end
    }

    fun setEndPoint(end: Point)
    {
        this.end = end
    }

    override fun toString(): String
    {
        return "Линия (начало=$start, конец=$end)"
    }
}