package ru.webshop.repository.hbm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.webshop.model.Role;
import ru.webshop.model.User;
import ru.webshop.repository.UserRepository;

import java.util.Collection;

/**
 * Created by ant-kord on 10.02.2016.
 */
@Repository
public class HbmUserRepositoryImpl implements UserRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Collection getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From User");
        return (Collection<User>)query.list();
    }

    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From User u where u.id = :id").setParameter("id", id);
        return (User)query.uniqueResult();
    }

    public Collection getUserByRole(Role role) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From User u where u.role.id = :id").setParameter("id", role.getId());
        return (Collection<User>)query.list();
    }
}
