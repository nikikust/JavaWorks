public class ball {
    private double x = 0.0;
    private double y = 0.0;

    public ball(){}
    public ball(double x1, double y1){
        x = x1;
        y = y1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x1, double y1){
        x = x1;
        y = y1;
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    public String toString() {
        return "Ball @ " +
                "(" + x +
                ", " + y +
                ')';
    }

    public static void main(String[] args){
        ball ball1 = new ball(10,10);

        System.out.println(ball1);

        ball1.move(-10, -10);

        System.out.println(ball1);
    }
}
