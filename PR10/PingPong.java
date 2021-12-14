import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PingPong extends Thread{
    static Lock lock = new ReentrantLock();
    public String op;

    public PingPong(String op) {this.op = op;}

    @Override
    public void run() {
        while (true){
            System.out.println(this.op);

            lock.lock();

            try {
                this.sleep(500);
            }
            catch (InterruptedException er) {}
            finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        PingPong ping = new PingPong("Ping");
        PingPong pong = new PingPong("Pong");
        ping.start();
        pong.start();
    }
}
