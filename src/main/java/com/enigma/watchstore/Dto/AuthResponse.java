package com.enigma.watchstore.Dto;

import java.io.Serializable;

public class AuthResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5236655413054616688L;

    private final String jwttoken;

    public AuthResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return jwttoken;
    }

}
