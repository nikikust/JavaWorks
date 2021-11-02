public class Square extends Rectangle {
    public Square()
    {
        this.width = 0;
        this.length = 0;
    }

    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return this.length;
    }

    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double width)
    {
        this.width = width;
        this.length = width;
    }

    public void setLength(double length)
    {
        this.width = length;
        this.length = length;
    }

    public String toString()
    {
        return this.color + ((this.filled)? " filled":" not filled") + " square with side = " + this.length;
    }
}
