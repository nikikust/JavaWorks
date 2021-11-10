public class horses extends Thread{
    private static int place = 1;

    public void run() {
        synchronized (horses.class) {
            System.out.println("Place " + place++ + ") " + getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("(Press any key)");
        System.out.print("Ready, Set... ");

        try{System.in.read();}
        catch (Exception e){}

        System.out.println("Go!!!");

        for (int i = 1; i <= 10; i++) {
            horses thread = new horses();
            thread.setName("Horse #" + i);
            thread.start();
        }
    }
}