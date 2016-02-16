package ru.webshop.web.component;

import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.graphicimage.GraphicImage;
import org.primefaces.component.menu.AbstractMenu;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.webshop.model.CatalogType;
import ru.webshop.service.CatalogTypeService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.util.Collection;

/**
 * Created by Administrator on 29.01.2016.
 */
@Component("menuComponent")
public class MenuComponent{

    @Autowired
    private CatalogTypeService catalogTypeService;

    public Collection getCatalogTypeAll(){
        return this.catalogTypeService.getAllCatalogType();
    }
}
