package ru.webshop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.Product;
import ru.webshop.repository.CatalogTypeRepository;
import ru.webshop.repository.ProductRepository;

import java.util.Collection;

/**
 * Created by Administrator on 06.01.2016.
 */
@Service
public class WebShopServiceImpl implements WebShopService {


    private Logger logger = LoggerFactory.getLogger(WebShopServiceImpl.class);
    private ProductRepository productRepository;

    private CatalogTypeRepository catalogTypeRepository;

    public WebShopServiceImpl(ProductRepository productRepository, CatalogTypeRepository catalogTypeRepository){
        this.productRepository = productRepository;
        this.catalogTypeRepository = catalogTypeRepository;
        logger.info("Get");
    }

    @Transactional(readOnly = true)
    public Collection<Product> getProductByCatalogType(int pageNumber, int pageLimit) throws DataAccessException {
        return productRepository.getProductByCatalogType(pageNumber, pageLimit);
    }
}
