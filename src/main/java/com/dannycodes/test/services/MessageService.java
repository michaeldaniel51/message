package com.dannycodes.test.services;

import com.dannycodes.test.entities.Message;
import com.dannycodes.test.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {



    @Autowired
    private MessageRepository messageRepository;



    public Message addmessage(Message message){
        return messageRepository.save(message);
    }

    public Message getByMessageId(int messageId){
        return messageRepository.findByMessageId(messageId);
    }

    public Message findByEmail(String email){
        return messageRepository.findByEmail(email);
    }

}
