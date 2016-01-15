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

    @Transactional
    public Collection<Product> getProductNew(boolean isNew, int pageNumber, int pageLimit) throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Product p where p.isNew = :isNew");
        query.setFirstResult(pageLimit * (pageNumber - 1));
        query.setMaxResults(pageLimit);
        query.setParameter("isNew", isNew);
        Collection<Product> collection = (Collection<Product>) query.list();
        return collection;
    }

    @Transactional
    public Product findProductById(int id) throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.load(Product.class, id);
        return product;
    }

    @Transactional
    public Collection<Product> findProductName(String name, int pageNumber, int pageLimit) throws DataAccessException {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Product p where p.name like :name");
        query.setFirstResult(pageLimit * (pageNumber - 1));
        query.setMaxResults(pageLimit);
        query.setParameter("name", name + "%");
        Collection<Product> collection = (Collection<Product>) query.list();
        return collection;
    }
}
