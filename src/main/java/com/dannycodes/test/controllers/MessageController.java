package com.dannycodes.test.controllers;

import com.dannycodes.test.entities.Message;
import com.dannycodes.test.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {


    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message createMessage(@RequestBody Message message){
        return messageService.addmessage(message);
    }

    @GetMapping("/v1/{messageId}")
    public Message findById(@PathVariable int messageId){
       return messageService.getByMessageId(messageId);
    }

    @GetMapping("/{email}")
    public Message findByEmail(@PathVariable String email){
       return messageService.findByEmail(email);
    }

}
