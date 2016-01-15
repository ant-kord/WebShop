package ru.webshop.repository;

import ru.webshop.model.CatalogType;

import java.util.Collection;

/**
 * Created by Administrator on 07.01.2016.
 */
public interface CatalogTypeRepository {

    Collection<CatalogType> getAllCatalogType();
    CatalogType getCatalogTypeById(int id);
}
