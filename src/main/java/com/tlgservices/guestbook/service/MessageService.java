package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> getAllMessages();
    void addMessage(Message message);

}
