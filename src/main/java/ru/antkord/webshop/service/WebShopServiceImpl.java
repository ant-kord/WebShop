package ru.antkord.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.antkord.webshop.model.Product;
import ru.antkord.webshop.repository.ProductRepository;

import java.util.Collection;

/**
 * Created by Administrator on 06.01.2016.
 */
@Service
public class WebShopServiceImpl implements WebShopService {

    private ProductRepository productRepository;

    @Autowired
    public WebShopServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public Collection<Product> getProductByCatalogType(int pageNumber, int pageLimit) throws DataAccessException {
        return productRepository.getProductByCatalogType(pageNumber, pageLimit);
    }
}
