import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service...");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating two Runnable...");
        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Runnable2 Task2 inside : " + Thread.currentThread().getName());
        };

        System.out.println("Submit the task specified by the runnable to the executor service.");
        executorService.submit(runnable);
        System.out.println("Inside : " + Thread.currentThread().getName());
        executorService.submit(runnable2);

        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}
