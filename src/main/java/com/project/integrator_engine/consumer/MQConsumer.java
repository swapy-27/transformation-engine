package com.project.integrator_engine.consumer;

import jakarta.jms.Message;
import jakarta.jms.MessageConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component
public class MQConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MQConsumer.class);

    @JmsListener(destination = "activeMq-example")
    public void messageListener(Message message){
        int i =1 ;
        LOGGER.info("Message "+ String.valueOf(++i) + " received" + message.toString());
    }

}
