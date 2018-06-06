package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.converter.EntityDTOConverter;
import com.tlgservices.guestbook.dao.MessageDAO;
import com.tlgservices.guestbook.dto.MessageDTO;
import com.tlgservices.guestbook.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageDAO messageDAO;

    @Autowired
    EntityDTOConverter<Message,MessageDTO> messageDTOConverter;

    @Override
    public List<MessageDTO> getAllMessages() {
        return messageDAO.getAllMessages().stream().map(messageDTOConverter::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public void addMessage(MessageDTO messageDTO) {
        messageDAO.addMessage(messageDTOConverter.convertToEntity(messageDTO));
    }
}
