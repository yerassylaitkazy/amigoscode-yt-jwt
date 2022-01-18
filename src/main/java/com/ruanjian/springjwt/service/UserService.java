package com.ruanjian.springjwt.service;

import com.ruanjian.springjwt.domain.Role;
import com.ruanjian.springjwt.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
