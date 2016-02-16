package ru.webshop.repository;

import ru.webshop.model.Role;
import ru.webshop.model.User;

import java.util.Collection;

/**
 * Created by ant-kord on 10.02.2016.
 */
public interface UserRepository {

    Collection getAllUsers();

    User getUserById(int id);

    Collection getUserByRole(Role role);

}
