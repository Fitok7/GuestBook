package com.tlgservices.guestbook.dao;

import com.tlgservices.guestbook.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAllUsers() {
        List<User> users = em.createQuery("FROM User us").getResultList();
        return users;
    }

    @Override
    public User getUserById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }
}
