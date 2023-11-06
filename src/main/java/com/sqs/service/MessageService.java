package com.sqs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class MessageService {

    @Autowired
    QueueMessagingTemplate queueMessagingTemplate;

    Logger log = LoggerFactory.getLogger(MessageService.class);
    @Value("${cloud.aws.end-point.uri}")
    private String endPoint;
    public String sendMessage(String message) {
        queueMessagingTemplate.send(endPoint, MessageBuilder.withPayload(message).build());
        return "Message sent to Queue";
    }

    @SqsListener("DemoQueue")
    public void recieveMessage(String message){
        log.info("Message received succesfully : {}",message);
    }

}
