package ru.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.CatalogType;
import ru.webshop.model.Product;
import ru.webshop.repository.CatalogTypeRepository;
import ru.webshop.repository.ProductRepository;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * Created by Administrator on 06.01.2016.
 */

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Collection<Product> getProductTypeAll() throws DataAccessException {
        return this.productRepository.getProductTypeAll();
    }

    @Transactional
    public Collection<Product> getProductTypeByCatalogId(Integer id) throws DataAccessException {
        return this.productRepository.getProductTypeByCatalogId(id);
    }

    @Transactional
    public Collection<Product> getProductByCatalogTypePaged(int pageNumber, int pageLimit) throws DataAccessException {
        return this.productRepository.getProductByCatalogTypePaged(pageNumber, pageLimit);
    }
}
