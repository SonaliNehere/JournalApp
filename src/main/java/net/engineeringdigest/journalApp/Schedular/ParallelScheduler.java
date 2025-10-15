package net.engineeringdigest.journalApp.Schedular;

//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//By default, all scheduled tasks run in a single thread.
//If you have multiple @Scheduled methods, they’ll wait for each other.
//You can make them run in parallel using @EnableAsync and @Async.

@Component
public class ParallelScheduler {

    @Async
    @Scheduled(fixedRate = 3000)
    public void taskOne() {
//        System.out.println("Task One: " + Thread.currentThread().getName());
    }

    @Async
    @Scheduled(fixedRate = 5000)
    public void taskTwo() {
//        System.out.println("Task Two: " + Thread.currentThread().getName());
    }

//    @KafkaListener(topics = "topic_1", groupId = "1")
//    public void consume(String s){
//        System.out.println("consumed : " + s);
//    }

}
