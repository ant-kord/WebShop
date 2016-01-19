package ru.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.CatalogType;
import ru.webshop.repository.CatalogTypeRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Collection;
import java.util.List;

/**
 * Created by ant-kord on 19.01.2016.
 */
@ManagedBean(name = "catalogType")
@SessionScoped
@Service
public class CatalogTypeServiceImpl implements CatalogTypeService {

    @Autowired
    private CatalogTypeRepository catalogTypeRepository;

//    @Autowired
//    public CatalogTypeServiceImpl(CatalogTypeRepository catalogTypeRepository){
//        this.catalogTypeRepository = catalogTypeRepository;
//    }

    @Transactional(readOnly = true)
    @Override
    public Collection<CatalogType> getAllCatalogType() throws DataAccessException {
        return (List)this.catalogTypeRepository.getAllCatalogType();
    }

    @Transactional(readOnly = true)
    @Override
    public CatalogType getCatalogTypeById(int id) throws DataAccessException {
        return this.catalogTypeRepository.getCatalogTypeById(id);
    }
}
