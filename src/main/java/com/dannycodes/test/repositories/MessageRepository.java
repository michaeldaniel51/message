package com.dannycodes.test.repositories;

import com.dannycodes.test.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer> {


    Message findByEmail(String email);

    Message findByMessageId(int messageId);
}
