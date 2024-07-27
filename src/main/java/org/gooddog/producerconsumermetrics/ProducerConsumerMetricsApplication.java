package org.gooddog.producerconsumermetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class ProducerConsumerMetricsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerConsumerMetricsApplication.class, args);
    }

    @KafkaListener(id = "myListener", topics = "test-topic")
    public void myListener(String str) {
        System.out.println("Received: " + str);
    }
}
