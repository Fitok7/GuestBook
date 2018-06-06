package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.converter.EntityDTOConverter;
import com.tlgservices.guestbook.dao.RoleDAO;
import com.tlgservices.guestbook.dto.RoleDTO;
import com.tlgservices.guestbook.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private EntityDTOConverter<Role,RoleDTO> roleDTOConverter;

    @Override
    public List<RoleDTO> getAllRoles() {
        return roleDAO.getAllRoles().stream().map(roleDTOConverter::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public RoleDTO getRoleById(long id) {
        return roleDTOConverter.convertToDTO(roleDAO.getRoleById(id));
    }

    @Override
    public void addRole(RoleDTO RoleDTO) {

    }
}
