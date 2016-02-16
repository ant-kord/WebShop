package ru.webshop.model;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by ant-kord on 06.01.2016.
 */
@Entity
@Table(name = "user")
public class User extends NamedEntity{

    @Column(name = "enabled")
    private boolean isEnabled;
    @Column(name = "createdDate")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
