package ru.webshop.repository;

import org.springframework.dao.DataAccessException;
import ru.webshop.model.Product;

import java.util.Collection;

/**
 * Created by ant-kord on 06.01.2016.
 */
public interface ProductRepository {

    Collection<Product> getProductByCatalogType(int pageNumber, int pageLimit) throws DataAccessException;

    Collection<Product> getProductNew(boolean isNew) throws DataAccessException;

    Product findProductById(int id) throws DataAccessException;

    Product findProductName(String name) throws DataAccessException;

}
