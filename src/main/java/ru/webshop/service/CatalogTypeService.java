package ru.webshop.service;

import org.springframework.dao.DataAccessException;
import ru.webshop.model.CatalogType;

import java.util.Collection;
import java.util.List;

/**
 * Created by ant-kord on 19.01.2016.
 */
public interface CatalogTypeService {

    List<CatalogType> getAllCatalogType() throws DataAccessException;

    CatalogType getCatalogTypeById(int id) throws DataAccessException;

}
