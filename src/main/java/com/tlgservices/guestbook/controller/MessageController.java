package com.tlgservices.guestbook.controller;

import com.tlgservices.guestbook.model.Message;
import com.tlgservices.guestbook.model.User;
import com.tlgservices.guestbook.service.MessageService;
import com.tlgservices.guestbook.service.RoleService;
import com.tlgservices.guestbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MessageController {

    final MessageService messageService;
    final UserService userService;
    final RoleService roleService;

    @Autowired
    public MessageController(MessageService messageService, UserService userService, RoleService roleService) {
        this.messageService = messageService;
        this.userService = userService;
        this.roleService = roleService;
    }

    @RequestMapping("/messages")
    public List<Message> getMessages()
    {
        return messageService.getAllMessages();
    }

    @RequestMapping(value = "/users/{roleid}/", method = RequestMethod.POST)
    public void addUser(@RequestBody User user, @PathVariable long roleid)
    {
        user.setUserRole(roleService.getRoleById(roleid));
        userService.addUser(user);
    }

    @RequestMapping(value = "/{userid}/message/", method = RequestMethod.POST)
    public void addMessage(@PathVariable long userid, @RequestBody Message message)
    {
        User user = userService.getUserById(userid);
        message.setUser(user);
        messageService.addMessage(message);
    }

    @RequestMapping("/users")
    public List<User> getUsers()
    {
        return userService.getAllUsers();
    }
}
