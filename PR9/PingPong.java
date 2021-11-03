public class PingPong extends Thread{

    @Override
    public void run() {
        System.out.println("Ping\nPong");
    }

    public static void main(String[] args) {
        while (true){
            PingPong thread = new PingPong();
            thread.start();
        }
    }
}
