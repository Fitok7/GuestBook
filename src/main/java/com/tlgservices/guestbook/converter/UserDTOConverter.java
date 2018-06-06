package com.tlgservices.guestbook.converter;

import com.tlgservices.guestbook.dao.RoleDAO;
import com.tlgservices.guestbook.dto.UserDTO;
import com.tlgservices.guestbook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDTOConverter implements EntityDTOConverter<User,UserDTO>{

@Autowired
private RoleDAO roleDAO;

    @Override
    public UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(),user.getName(),user.getUserRole().getId());
    }

    @Override
    public User convertToEntity(UserDTO DTO) {
        User user = new User();
        user.setName(DTO.getName());
        user.setUserRole(roleDAO.getRoleById(DTO.getRoleID()));
        return user;
    }

}
