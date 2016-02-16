package ru.webshop.web;

import org.primefaces.component.graphicimage.GraphicImage;
import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.*;
import ru.webshop.model.CatalogType;
import ru.webshop.service.CatalogTypeService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ant-kord on 01.02.2016.
 */
@ManagedBean(name = "managedMenu")
@ViewScoped
public class ManagedMenu implements Serializable{
    @ManagedProperty("#{catalogTypeServiceImpl}")
    private CatalogTypeService catalogTypeService;
    private MenuModel model;
    private Map<Integer,Integer> map;
    private Integer id;

    public void setCatalogTypeService(CatalogTypeService catalogTypeService) {
        this.catalogTypeService = catalogTypeService;
    }

    private void init(){
        model = new DefaultMenuModel();
        map = new HashMap<Integer, Integer>();
        GraphicImage logo = new GraphicImage();
        logo.setName("/css/logo.png");
        logo.setHeight("50");
        DefaultMenuItem logoType = new DefaultMenuItem(logo);
        for(CatalogType catalog : catalogTypeService.getAllCatalogType()){
            DefaultMenuItem item = new DefaultMenuItem(catalog.getName());
            //item.setOutcome("/catalog/" + catalog.getUrl());
            item.setId(String.valueOf(catalog.getId()));
            item.setCommand("#{managedMenu.catalogId}");
            map.put(catalog.getId(), catalog.getId());
            model.addElement(item);
        }
    }

    public MenuModel getModel() {
        init();
        return model;
    }


    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String catalogId(ActionEvent event){
        MenuItem item = ((MenuActionEvent)event).getMenuItem();
        Integer catalog_id = (Integer.parseInt(item.getId()));
        setId(catalog_id);
        return "/catalog/cat.xhtml";
    }
}
