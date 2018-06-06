package com.tlgservices.guestbook.controller;

import com.tlgservices.guestbook.converter.EntityDTOConverter;
import com.tlgservices.guestbook.dto.MessageDTO;
import com.tlgservices.guestbook.dto.RoleDTO;
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


    @Autowired
    public MessageController(MessageService messageService, UserService userService, RoleService roleService, EntityDTOConverter<User, UserDTO> userDTOConverter, EntityDTOConverter<Message, MessageDTO> messageDTOConverter) {
        this.messageService = messageService;
        this.userService = userService;
        this.roleService = roleService;

    }

    @RequestMapping("/messages")
    public List<MessageDTO> getMessages()
    {
        return messageService.getAllMessages();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody UserDTO userDTO)
    {
        userService.addUser(userDTO);
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public void addMessage(@RequestBody MessageDTO messageDTO)
    {
        messageService.addMessage(messageDTO);
    }

    @RequestMapping("/users")
    public List<UserDTO> getUsers()
    {
        return userService.getAllUsers();
    }

    @RequestMapping("/roles")
    public List<RoleDTO> getRoles()
    {
        return roleService.getAllRoles();
    }

    @RequestMapping("/roles/{roleID}")
    public RoleDTO getRoleByID(@PathVariable long roleID)
    {
        return roleService.getRoleById(roleID);
    }

}
