public class Circle extends Shape{
    protected double radius;

    public Circle()
    {
        this.radius = 0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public String toString()
    {
        return this.color + ((this.filled)? " filled":" not filled") + " circle with radius = " + this.radius;
    }
}
