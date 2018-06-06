package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.converter.EntityDTOConverter;
import com.tlgservices.guestbook.dao.UserDAO;
import com.tlgservices.guestbook.dto.UserDTO;
import com.tlgservices.guestbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private EntityDTOConverter<User,UserDTO> userDTOConverter;
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO getUserById(long id) {
        return userDTOConverter.convertToDTO(userDAO.getUserById(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userDAO.getAllUsers().stream().map(userDTOConverter::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public void addUser(UserDTO UserDTO) {
        userDAO.addUser(userDTOConverter.convertToEntity(UserDTO));
    }
}
