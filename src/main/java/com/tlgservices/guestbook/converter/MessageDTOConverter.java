package com.tlgservices.guestbook.converter;

import com.tlgservices.guestbook.dto.MessageDTO;
import com.tlgservices.guestbook.model.Message;
import com.tlgservices.guestbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MessageDTOConverter implements EntityDTOConverter<Message,MessageDTO> {

    @Autowired
    UserService userService;

    @Override
    public MessageDTO convertToDTO(Message message) {
        return new MessageDTO(message.getId(),message.getMessage(),message.getUser().getId());
    }

    @Override
    public Message convertToEntity(MessageDTO messageDTO) {
        Message message = new Message();
        message.setId(messageDTO.getId());
        message.setMessage(messageDTO.getMessage());
        message.setUser(userService.getUserById(messageDTO.getUserID()));
        return message;
    }
}
