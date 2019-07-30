package com.rabbitmq.rabbitmqlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener  implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		
		System.out.println(new String(message.getBody()));
		
	}

}
