package ru.webshop.model;


import javax.persistence.*;

/**
 * Created by ant-kord on 06.01.2016.
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
