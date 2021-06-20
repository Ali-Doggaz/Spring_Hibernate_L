package com.example.demo.user;



import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }

}
