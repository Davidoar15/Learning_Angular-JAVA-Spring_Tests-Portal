package com.system.tests.services;

import java.util.Set;

import com.system.tests.entities.User;
import com.system.tests.entities.UserRol;

public interface UserService {
    
    public User saveUser(User user, Set<UserRol> userRoles) throws Exception;

}
