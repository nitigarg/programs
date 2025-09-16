package blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {
    private static final  int QUEUE_CAPACITY=10;
    private static final int  num_orders=5;
    public static void main(String args[]) throws InterruptedException {
        BlockingQueue<Order> boundedBlockingQueue=new LinkedBlockingQueue<>(QUEUE_CAPACITY);
        //Producer Thread
        Thread producer=new Thread(()->{
           try{
               for(int i=1;i<=num_orders;i++){
                Order order=new Order(false,i);
                   boundedBlockingQueue.put(order);
                   System.out.println("[Producer] Produced " + order);
                   Thread.sleep(500);
               }
               //send poisonPill signal to shut down consumer
               boundedBlockingQueue.put(new Order(true,-1));
               System.out.println("[Producer] sent poison pill");

           }
           catch(InterruptedException e){
               Thread.currentThread().interrupt();
           }
        });

        //Consumer Thread
        Thread consumer=new Thread(()->{
            try{
                while(true){
                   Order order= boundedBlockingQueue.take();
                   if(order.isPoisonPill()){
                       System.out.println("Consumer have received poision pill and will shutdown");
                       break;
                   }
                    System.out.println("[consumer] is processing order");
                   Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        //start threads
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("✅ System shutdown complete.");
    }
}
