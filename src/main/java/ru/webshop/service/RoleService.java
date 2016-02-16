package ru.webshop.service;

import ru.webshop.model.Role;

import java.util.Collection;

/**
 * Created by ant-kord on 10.02.2016.
 */
public interface RoleService {

    Collection getAllRoles();

    Role getRoleById(Integer id);
}
