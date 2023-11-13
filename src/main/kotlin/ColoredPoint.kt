class ColoredPoint(x: Int, y: Int, private var color: String) : Point(x, y)
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
        return "Цветная точка (x=$x, y=$y, цвет =$color)"
    }
}