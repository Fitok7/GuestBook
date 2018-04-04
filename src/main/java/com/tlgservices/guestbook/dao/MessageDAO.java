package com.tlgservices.guestbook.dao;

import com.tlgservices.guestbook.model.Message;

import java.util.List;

public interface MessageDAO {
    List<Message> getAllMessages();
    void addMessage(Message message);
}
