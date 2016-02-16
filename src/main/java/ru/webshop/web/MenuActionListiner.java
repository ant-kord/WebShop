package ru.webshop.web;

import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.MenuItem;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by ant-kord on 09.02.2016.
 */
@ManagedBean
@ViewScoped
public class MenuActionListiner implements ActionListener,Serializable{
    private Integer id;

    public Integer getId() {
        return id;
    }


    public void processAction(ActionEvent event) throws AbortProcessingException {
        Map<String, Object> map = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        for(Map.Entry<String,Object> pair : map.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }
}
