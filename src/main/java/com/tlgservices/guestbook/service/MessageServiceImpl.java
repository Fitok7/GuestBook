package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.dao.MessageDAO;
import com.tlgservices.guestbook.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageDAO messageDAO;

    @Override
    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    @Override
    public void addMessage(Message message) {
        messageDAO.addMessage(message);
    }
}
