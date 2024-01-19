package com.system.tests.services;

import java.util.Set;

import com.system.tests.entities.User;
import com.system.tests.entities.UserRol;

public interface UserService {
    
    public User saveUser(User user, Set<UserRol> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);

}
