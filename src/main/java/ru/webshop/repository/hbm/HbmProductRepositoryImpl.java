package ru.webshop.repository.hbm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Transactional
    public Collection<Product> getProductByCatalogType(int pageNumber, int pageLimit) throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Product");
        query.setFirstResult(pageLimit * (pageNumber - 1));
        query.setMaxResults(pageLimit);
        Collection<Product> products = (Collection<Product>) query.list();
        return products;
    }

    public Collection<Product> getProductNew(boolean isNew) throws DataAccessException {
        return null;
    }

    public Product findProductById(int id) throws DataAccessException {
        return null;
    }

    public Product findProductName(String name) throws DataAccessException {
        return null;
    }
}
