package com.tlgservices.guestbook.dao;

import com.tlgservices.guestbook.model.Role;

import java.util.List;

public interface RoleDAO {
    List<Role> getAllRoles();
    Role getRoleById(long id);
    void addRole(Role role);
}
