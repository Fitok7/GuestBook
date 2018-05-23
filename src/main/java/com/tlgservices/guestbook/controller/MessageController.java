package com.tlgservices.guestbook.controller;

import com.tlgservices.guestbook.converter.EntityDTOConverter;
import com.tlgservices.guestbook.dto.MessageDTO;
import com.tlgservices.guestbook.dto.UserDTO;
import com.tlgservices.guestbook.model.Message;
import com.tlgservices.guestbook.model.User;
import com.tlgservices.guestbook.service.MessageService;
import com.tlgservices.guestbook.service.RoleService;
import com.tlgservices.guestbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest")
public class MessageController
{
    private final MessageService messageService;
    private final UserService userService;
    private final RoleService roleService;

    private final EntityDTOConverter<User,UserDTO> userDTOConverter;
    private final EntityDTOConverter<Message,MessageDTO> messageDTOConverter;

    @Autowired
    public MessageController(MessageService messageService, UserService userService, RoleService roleService, EntityDTOConverter<User, UserDTO> userDTOConverter, EntityDTOConverter<Message, MessageDTO> messageDTOConverter) {
        this.messageService = messageService;
        this.userService = userService;
        this.roleService = roleService;
        this.userDTOConverter = userDTOConverter;
        this.messageDTOConverter = messageDTOConverter;
    }

    @RequestMapping("/messages")
    public List<MessageDTO> getMessages()
    {
        return messageService.getAllMessages().stream().map((messageDTOConverter::convertToDTO)).collect(Collectors.toList());
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody UserDTO userDTO)
    {
        userService.addUser(userDTOConverter.convertToEntity(userDTO));
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public void addMessage(@RequestBody MessageDTO messageDTO)
    {
        messageService.addMessage(messageDTOConverter.convertToEntity(messageDTO));
    }

    @RequestMapping("/users")
    public List<UserDTO> getUsers()
    {
        return userService.getAllUsers().stream().map((userDTOConverter::convertToDTO)).collect(Collectors.toList());
    }



}
