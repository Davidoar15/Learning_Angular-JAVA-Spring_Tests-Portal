package com.system.tests.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String password;

    private String name;

    private String lastName;

    private String email;

    private String cellPhone;

    private String profile;
    
    private Boolean enable = true; //Make Tests
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private Set<UserRol> userRoles = new HashSet<>();

    public User() {
        
    }

    // ? Getters and Setters

        public Long getUserId() {
            return userId;
        }
        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public String getCellPhone() {
            return cellPhone;
        }
        public void setCellPhone(String cellPhone) {
            this.cellPhone = cellPhone;
        }

        public String getProfile() {
            return profile;
        }
        public void setProfile(String profile) {
            this.profile = profile;
        }

        public boolean getEnable() {
            return enable;
        }
        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        public Set<UserRol> getUserRoles() {
            return userRoles;
        }
        public void setUserRoles(Set<UserRol> userRoles) {
            this.userRoles = userRoles;
        }

    // ? Getters and Setters
}
