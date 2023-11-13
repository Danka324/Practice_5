class ColoredLine(start: Point, end: Point, private var color: String) : Line(start, end)
{
    fun setColor(color: String) {
        this.color = color
    }

    fun getColor(): String
    {
        return color
    }

    override fun toString(): String
    {
        return "Цветная линия (начало=$start, конец=$end, цвет=$color)"
    }
}