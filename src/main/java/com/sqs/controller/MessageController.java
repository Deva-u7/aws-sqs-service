package com.sqs.controller;

import com.sqs.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

     @Autowired
     MessageService messageService;

    @GetMapping("api/send/{message}")
    public ResponseEntity<String> sendMessage(@PathVariable String message) {
       String response = messageService.sendMessage(message);
        return ResponseEntity.ok(response);
    }
}
