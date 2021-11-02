public class main {
    public static void main(String[] args) {
        MovableCircle a = new MovableCircle(10, 10, 5, 2, 3);
        System.out.println(a);

        MovableRectangle b = new MovableRectangle(0, 0, 50, 50, 15, 20);

        System.out.println(b.sameSpeed());
        System.out.println(b);
    }
}
