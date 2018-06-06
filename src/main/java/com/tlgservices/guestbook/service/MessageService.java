package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.dto.MessageDTO;
import com.tlgservices.guestbook.model.Message;

import java.util.List;

public interface MessageService {

    List<MessageDTO> getAllMessages();
    void addMessage(MessageDTO messageDTO);

}
