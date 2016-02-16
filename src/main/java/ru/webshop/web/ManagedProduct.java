package ru.webshop.web;

import org.primefaces.component.datascroller.DataScroller;
import org.primefaces.component.datascroller.DataScrollerRenderer;
import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.*;
import org.primefaces.model.menu.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import ru.webshop.model.CatalogType;
import ru.webshop.model.Product;
import ru.webshop.service.CatalogTypeService;
import ru.webshop.service.ProductService;

import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpServlet;
import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Administrator on 03.02.2016.
 */
@ManagedBean(name = "managedProduct")
@ViewScoped
public class ManagedProduct implements Serializable{


    @ManagedProperty("#{productServiceImpl}")
    private ProductService productService;

    @ManagedProperty("#{catalogTypeServiceImpl}")
    private CatalogTypeService catalogTypeService;



    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void setCatalogTypeService(CatalogTypeService catalogTypeService) {
        this.catalogTypeService = catalogTypeService;
    }


    public String getTitle(int id){
        return this.catalogTypeService.getCatalogTypeById(id).getName();}


    public Collection getCatalogTypeAll(){
        return this.catalogTypeService.getAllCatalogType();
    }


    public Collection getProductByCatalogId(int id) {
        return productService.getProductTypeByCatalogId(id);
    }


}
