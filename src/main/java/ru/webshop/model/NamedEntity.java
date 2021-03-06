package ru.webshop.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by ant-kord on 06.01.2016.
 */
@MappedSuperclass
public class NamedEntity extends BaseEntity{

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
