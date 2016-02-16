package ru.webshop.web.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.webshop.service.CatalogTypeService;
import ru.webshop.service.ProductService;

import javax.faces.bean.SessionScoped;
import java.util.Collection;

/**
 * Created by ant-kord on 21.01.2016.
 */
@Component("productComponent")
@SessionScoped
public class ProductComponent {

    @Autowired
    private ProductService productService;

    @Autowired
    private CatalogTypeService catalogTypeService;

    public Collection getCatalogTypeAll(){
        return this.catalogTypeService.getAllCatalogType();
    }

    public Collection getProductList(){return productService.getProductTypeAll();}

//    public Collection getProductListByCatalogId(){return productService.getProductTypeByCatalogId();}
}
