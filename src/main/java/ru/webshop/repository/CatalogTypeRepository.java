package ru.webshop.repository;

import ru.webshop.model.CatalogType;

import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 07.01.2016.
 */
public interface CatalogTypeRepository {

    List<CatalogType> getAllCatalogType();
    CatalogType getCatalogTypeById(int id);
}
