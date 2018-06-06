package com.tlgservices.guestbook.converter;

import com.tlgservices.guestbook.dto.RoleDTO;
import com.tlgservices.guestbook.model.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleDTOConverter implements EntityDTOConverter<Role,RoleDTO> {

    @Override
    public RoleDTO convertToDTO(Role entity) {
        return new RoleDTO(entity.getId(), entity.getName());
    }

    @Override
    public Role convertToEntity(RoleDTO roleDTO) {
        Role role = new Role();
        role.setId(roleDTO.getId());
        role.setName(roleDTO.getName());
        return role;
    }
}
