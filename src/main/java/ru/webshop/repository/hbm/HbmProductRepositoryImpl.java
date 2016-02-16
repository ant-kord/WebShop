package ru.webshop.repository.hbm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.Product;
import ru.webshop.repository.ProductRepository;

import java.util.Collection;

/**
 * Created by ant-kord on 06.01.2016.
 */
@Repository
public class HbmProductRepositoryImpl implements ProductRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    public Collection<Product> getProductTypeAll() throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Product");
        Collection<Product> products = (Collection<Product>) query.list();
        return products;
    }

    public Collection<Product> getProductTypeByCatalogId(int id) throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Product p where p.type.id = :id").setParameter("id", id);
        Collection<Product> products = (Collection<Product>) query.list();
        return products;
    }


    public Collection<Product> getProductByCatalogTypePaged(int pageNumber, int pageLimit) throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Product");
        query.setFirstResult(pageLimit * (pageNumber - 1));
        query.setMaxResults(pageLimit);
        Collection<Product> products = (Collection<Product>) query.list();
        return products;
    }

    public Collection<Product> getProductNew(boolean isNew, int pageNumber, int pageLimit) throws DataAccessException {
        return null;
    }


    public Product findProductById(int id) throws DataAccessException {
        return null;
    }

    public Collection<Product> findProductName(String name, int pageNumber, int pageLimit) throws DataAccessException {
        return null;
    }

}
