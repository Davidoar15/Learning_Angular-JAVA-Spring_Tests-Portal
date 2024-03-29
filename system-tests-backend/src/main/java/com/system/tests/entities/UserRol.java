package com.system.tests.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Rol rol;
    
    public UserRol() {

    }

    // ? Getters and Setters

        public Long getUserRolId() {
            return userRolId;
        }
        public void setUserRolId(Long userRolId) {
            this.userRolId = userRolId;
        }

        public User getUser() {
            return user;
        }
        public void setUser(User user) {
            this.user = user;
        }

        public Rol getRol() {
            return rol;
        }
        public void setRol(Rol rol) {
            this.rol = rol;
        }

    // ? Getters and Setters

}
