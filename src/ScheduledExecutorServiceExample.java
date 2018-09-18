import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task1 = () -> {
          System.out.println("Executing Task1 At " + System.nanoTime());
        };

        Runnable task2 = () -> {
          System.out.println("Executing Task2 At " + System.nanoTime());
        };

        System.out.println("Submitting task at " + System.nanoTime() + " to be executed after 5 seconds.");
        scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task2, 5, TimeUnit.SECONDS);
        
        scheduledExecutorService.shutdown();
    }
}
