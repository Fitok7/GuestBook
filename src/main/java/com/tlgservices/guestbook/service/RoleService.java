package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(long id);
    void addRole(Role role);
}
