package ru.webshop.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by ant-kord on 09.02.2016.
 */
@Entity
@Table(name = "role")
public class Role extends NamedEntity {
}
