package ru.webshop.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ant-kord on 06.01.2016.
 */
@Entity
@Table(name = "catalog")
@ManagedBean(name = "catalog")
public class CatalogType extends NamedEntity{

    @Column(name = "url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
