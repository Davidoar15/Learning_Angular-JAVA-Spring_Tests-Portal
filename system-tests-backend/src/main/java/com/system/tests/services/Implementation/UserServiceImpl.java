package com.system.tests.services.Implementation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.tests.entities.User;
import com.system.tests.entities.UserRol;
import com.system.tests.repositories.RolRepository;
import com.system.tests.repositories.UserRepository;
import com.system.tests.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public User saveUser(User user, Set<UserRol> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());

        if (localUser != null) {
            System.out.println("User already exists");
            throw new Exception("User is already presents");
        } else {
            for(UserRol userRol:userRoles) {
                rolRepository.save(userRol.getRol());
            }

            user.getUserRoles().addAll(userRoles);
            localUser = userRepository.save(user);
        }

        return localUser;
    }

}
