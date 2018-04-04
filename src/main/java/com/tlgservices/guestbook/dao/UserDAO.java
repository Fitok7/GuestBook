package com.tlgservices.guestbook.dao;

import com.tlgservices.guestbook.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(long id);
    void addUser(User user);
}
