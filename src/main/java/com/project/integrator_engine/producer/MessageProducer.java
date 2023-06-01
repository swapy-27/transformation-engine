package com.project.integrator_engine.producer;


import com.project.integrator_engine.mongorepositories.modal.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducer {

    private JmsTemplate jmsTemplate;

    @PostMapping("/producer")
    public ResponseEntity<String> produceMessageToQueue(@RequestBody Message message){
        try
        {
            jmsTemplate.convertAndSend("activeMq-example",message);
            return  new ResponseEntity("hogaya bhai tera kaam", HttpStatus.OK);
        }catch(Exception e){
            return  new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }



}
