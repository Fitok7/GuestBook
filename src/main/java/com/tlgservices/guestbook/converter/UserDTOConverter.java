package com.tlgservices.guestbook.converter;

import com.tlgservices.guestbook.dto.UserDTO;
import com.tlgservices.guestbook.model.User;
import com.tlgservices.guestbook.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDTOConverter implements EntityDTOConverter<User,UserDTO>{

@Autowired
RoleService roleService;

    @Override
    public UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(),user.getName(),user.getUserRole().getId());
    }

    @Override
    public User convertToEntity(UserDTO DTO) {
        User user = new User();
        user.setId(DTO.getId());
        user.setName(DTO.getName());
        user.setUserRole(roleService.getRoleById(DTO.getId()));
        return user;
    }

}
