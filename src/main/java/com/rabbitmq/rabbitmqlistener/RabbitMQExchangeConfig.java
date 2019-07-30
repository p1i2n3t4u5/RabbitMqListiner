package com.rabbitmq.rabbitmqlistener;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {

	@Bean
	Exchange exampleExchange() {
		return new TopicExchange("ExampleExchange");
	}

	@Bean
	Exchange exampleExchange2() {
		return ExchangeBuilder.directExchange("ExampleExchange2").autoDelete().internal().build();
	}

	@Bean
	Exchange exampleExchange3() {
		return ExchangeBuilder.topicExchange("TopicTestExchange").autoDelete().durable(true).internal().build();
	}

	@Bean
	Exchange exampleExchange4() {
		return ExchangeBuilder.fanoutExchange("FanoutTestExchange").autoDelete().durable(true).internal().build();
	}

	@Bean
	Exchange exampleExchange5() {
		return ExchangeBuilder.headersExchange("HeadersTestExchange").autoDelete().durable(true).internal()
				.ignoreDeclarationExceptions().build();
	}

}
