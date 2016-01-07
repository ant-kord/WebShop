package ru.antkord.webshop.repository.hbm;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import ru.antkord.webshop.model.Product;
import ru.antkord.webshop.repository.ProductRepository;

import java.util.Collection;

/**
 * Created by ant-kord on 06.01.2016.
 */
@Repository
public class HbmProductRepositoryImpl implements ProductRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public Collection<Product> getProductByCatalogType(int id) throws DataAccessException {
        return null;
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
