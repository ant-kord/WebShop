package ru.webshop.service;

import ru.webshop.model.Role;
import ru.webshop.model.User;

import java.util.Collection;

/**
 * Created by ant-kord on 10.02.2016.
 */
public interface UserService {

    Collection getAllUser();

    User getUserById(Integer id);

    User getUserByRole(Role role);
}
