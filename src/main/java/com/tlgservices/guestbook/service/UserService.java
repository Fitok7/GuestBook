package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.dto.UserDTO;
import com.tlgservices.guestbook.model.User;

import java.util.List;

public interface UserService {
    UserDTO getUserById(long id);
    List<UserDTO> getAllUsers();
    void addUser(UserDTO userDTO);

}
