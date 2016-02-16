package ru.webshop.repository;

import ru.webshop.model.Role;

import java.util.Collection;

/**
 * Created by ant-kord on 09.02.2016.
 */
public interface RoleRepository {

    Collection getAllRoles();

    Role getRoleById(Integer id);

}
