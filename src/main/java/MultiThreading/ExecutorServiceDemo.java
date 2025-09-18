package MultiThreading;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
   public static void main(String args[]) throws ExecutionException, InterruptedException {
       ExecutorService executor= Executors.newFixedThreadPool(5);
       Callable<String> task=()->{
           Thread.sleep(1000);
           return "Task result";
       };
       Future<String> future=executor.submit(task);
       System.out.println("Is task done "+future.isDone());
       System.out.println("Is task cancelled "+future.isCancelled());
       System.out.println("Result" + future.get());
       executor.shutdown();
   }
}
