package ru.webshop.model;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by ant-kord on 06.01.2016.
 */
@Entity
@Table(name = "user")
public class User extends NamedEntity{

    @Column(name = "isAdmin")
    private boolean isAdmin;
    @Column(name = "createdDate")
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
