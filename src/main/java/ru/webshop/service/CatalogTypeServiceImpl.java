package ru.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.CatalogType;
import ru.webshop.repository.CatalogTypeRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ant-kord on 19.01.2016.
 */
@ManagedBean
@Service
@ViewScoped
public class CatalogTypeServiceImpl implements CatalogTypeService, Serializable {

    @Autowired
    private CatalogTypeRepository catalogTypeRepository;

    public void setCatalogTypeRepository(CatalogTypeRepository catalogTypeRepository) {
        this.catalogTypeRepository = catalogTypeRepository;
    }

    @Transactional
    public List<CatalogType> getAllCatalogType() throws DataAccessException {
        return this.catalogTypeRepository.getAllCatalogType();
    }

    @Transactional
    public CatalogType getCatalogTypeById(int id) throws DataAccessException {
        return this.catalogTypeRepository.getCatalogTypeById(id);
    }

}
