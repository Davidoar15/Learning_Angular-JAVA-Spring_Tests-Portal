package com.system.tests.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {
    
    @Id
    private Long rolId;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private Set<UserRol> userRoles = new HashSet<>();

    public Rol() {
        
    }

    // ? Getters and Setters

        public Long getRolId() {
            return rolId;
        }
        public void setRolId(Long rolId) {
            this.rolId = rolId;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Set<UserRol> getUserRoles() {
            return userRoles;
        }
        public void setUserRoles(Set<UserRol> userRoles) {
            this.userRoles = userRoles;
        }

    // ? Getters and Setters

}
