package ru.antkord.webshop.service;

import org.springframework.dao.DataAccessException;
import ru.antkord.webshop.model.Product;

import java.util.Collection;

/**
 * Created by ant-kord on 06.01.2016.
 */
public interface WebShopService {

    Collection<Product> getProductByCatalogType(int pageNumber, int pageLimit) throws DataAccessException;
}
