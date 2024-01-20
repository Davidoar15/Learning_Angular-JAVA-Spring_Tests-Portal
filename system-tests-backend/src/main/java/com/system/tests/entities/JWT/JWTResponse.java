package com.system.tests.entities.JWT;

public class JWTResponse {
    
    private String token;
    
    public JWTResponse() {

    }

    public JWTResponse(String token) {
        this.token = token;
    }

    // ? Getter and Setter

        public String getToken() {
            return token;
        }
        public void setToken(String token) {
            this.token = token;
        }

    // ? Getter and Setter

}
