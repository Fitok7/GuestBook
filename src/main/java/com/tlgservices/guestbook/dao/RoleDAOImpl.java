package com.tlgservices.guestbook.dao;

import com.tlgservices.guestbook.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO{

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public Role getRoleById(long id) {
        return em.find(Role.class, id);
    }

    @Override
    public void addRole(Role role) {

    }
}
