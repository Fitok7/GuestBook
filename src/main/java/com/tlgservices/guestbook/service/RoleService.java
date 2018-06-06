package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.dto.RoleDTO;
import com.tlgservices.guestbook.model.Role;

import java.util.List;

public interface RoleService {
    List<RoleDTO> getAllRoles();
    RoleDTO getRoleById(long id);
    void addRole(RoleDTO role);
}
