package com.tlgservices.guestbook.converter;

import com.tlgservices.guestbook.dao.UserDAO;
import com.tlgservices.guestbook.dto.MessageDTO;
import com.tlgservices.guestbook.dto.UserDTO;
import com.tlgservices.guestbook.model.Message;
import com.tlgservices.guestbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MessageDTOConverter implements EntityDTOConverter<Message,MessageDTO> {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private EntityDTOConverter<User,UserDTO> userDTOConverter;

    @Override
    public MessageDTO convertToDTO(Message message) {
        return new MessageDTO(message.getMessage(),message.getUser().getId());
    }

    @Override
    public Message convertToEntity(MessageDTO messageDTO) {
        Message message = new Message();
        message.setMessage(messageDTO.getMessage());
        message.setUser(userDAO.getUserById(messageDTO.getUserID()));
        return message;
    }
}
