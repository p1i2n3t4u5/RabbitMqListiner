package com.rabbitmq.rabbitmqlistener;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfig {
	
	@Bean
    Queue myQueue2() {
		return new Queue("ExampleQueue", false);
	}
	
	@Bean
	Queue myQueue3() {
		return QueueBuilder.durable("ExampleQueue2").exclusive().autoDelete().build();
	}

}
