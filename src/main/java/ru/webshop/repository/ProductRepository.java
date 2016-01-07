package ru.webshop.repository;

import org.springframework.dao.DataAccessException;
import ru.webshop.model.Product;

import java.util.Collection;

/**
 * Created by ant-kord on 06.01.2016.
 */
public interface ProductRepository {

    Collection<Product> getProductByCatalogType(int id) throws DataAccessException;

    Collection<Product> getProductNew(boolean isNew, int pageNumber, int pageLimit) throws DataAccessException;

    Product findProductById(int id) throws DataAccessException;

    Collection<Product> findProductName(String name, int pageNumber, int pageLimit) throws DataAccessException;

}
