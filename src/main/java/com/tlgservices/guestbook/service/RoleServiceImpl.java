package com.tlgservices.guestbook.service;

import com.tlgservices.guestbook.dao.RoleDAO;
import com.tlgservices.guestbook.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDAO roleDAO;


    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public Role getRoleById(long id) {
        return roleDAO.getRoleById(id);
    }

    @Override
    public void addRole(Role role) {

    }
}
