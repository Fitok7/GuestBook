package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.model.User;

import java.util.List;

public interface UserService {
    User getUserById(long id);
    List<User> getAllUsers();
    void addUser(User user);

}
