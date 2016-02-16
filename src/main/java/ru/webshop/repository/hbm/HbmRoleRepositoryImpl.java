package ru.webshop.repository.hbm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.webshop.model.Role;
import ru.webshop.model.User;
import ru.webshop.repository.RoleRepository;

import java.util.Collection;

/**
 * Created by ant-kord on 10.02.2016.
 */
@Repository
public class HbmRoleRepositoryImpl implements RoleRepository {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Collection getAllRoles() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Role");
        return (Collection<Role>) query.list();
    }

    public Role getRoleById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Role r where r.id = :id").setParameter("id", id);
        return (Role)query.uniqueResult();
    }
}
