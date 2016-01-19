package ru.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.CatalogType;
import ru.webshop.model.Product;
import ru.webshop.repository.CatalogTypeRepository;
import ru.webshop.repository.ProductRepository;

import java.util.Collection;

/**
 * Created by Administrator on 06.01.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;


    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, CatalogTypeRepository catalogTypeRepository){
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public Collection<Product> getProductByCatalogType(int pageNumber, int pageLimit) throws DataAccessException {
        return productRepository.getProductByCatalogType(pageNumber, pageLimit);
    }

}
