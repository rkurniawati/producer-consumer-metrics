package org.gooddog.producerconsumermetrics.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@EnableKafka
public class ConsumerConfig {
    // nothing here for the initial version, we just need to enable kafka via annotation
}
