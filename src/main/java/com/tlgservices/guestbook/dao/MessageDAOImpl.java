package com.tlgservices.guestbook.dao;

import com.tlgservices.guestbook.model.Message;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MessageDAOImpl implements MessageDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Message> getAllMessages() {
        return em.createQuery("FROM Message").getResultList();
    }

    @Override
    public void addMessage(Message message) {
        em.persist(message);
    }
}
