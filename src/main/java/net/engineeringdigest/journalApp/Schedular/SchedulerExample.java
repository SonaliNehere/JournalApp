package net.engineeringdigest.journalApp.Schedular;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerExample {

//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;

//    @Scheduled(fixedRate = 10000)
//    public void runTask() {
//        System.out.println("Task running at: " + java.time.LocalTime.now());
//        kafkaTemplate.send("topic_1", String.valueOf(java.time.LocalTime.now()),  String.valueOf(java.time.LocalTime.now()));
//    }

//    Run every day at 17:05
//    @Scheduled(cron = "0 05 17 * * *")
//    public void dailyJob() {
//        System.out.println("Daily task executed at 17:05 ");
//    }

}
