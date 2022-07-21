import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        SemaphoreClass car1 = new SemaphoreClass(semaphore, "Nord-South");
        SemaphoreClass car2 = new SemaphoreClass(semaphore, "Nord-South");
        SemaphoreClass car3 = new SemaphoreClass(semaphore, "West-East");

//        car1.run();
//        car2.run();

        car1.start();
        car2.start();
        car1.join();
        car2.join();
    }
}
