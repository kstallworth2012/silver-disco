package com.match.engine.OrderEngine.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	
	
//	define message types to send  
    private final KafkaTemplate<String, byte[]> kafkaTemplate;
	
    public KafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}


	
	
	
}
