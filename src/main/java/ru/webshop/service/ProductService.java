package ru.webshop.service;

import org.springframework.dao.DataAccessException;
import ru.webshop.model.CatalogType;
import ru.webshop.model.Product;

import java.util.Collection;

/**
 * Created by ant-kord on 06.01.2016.
 */
public interface ProductService {


    Collection<Product> getProductTypeAll() throws DataAccessException;

    Collection<Product> getProductTypeByCatalogId(Integer id) throws DataAccessException;

    Collection<Product> getProductByCatalogTypePaged(int pageNumber, int pageLimit) throws DataAccessException;


}
