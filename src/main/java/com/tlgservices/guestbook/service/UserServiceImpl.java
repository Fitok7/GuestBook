package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.dao.UserDAO;
import com.tlgservices.guestbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
