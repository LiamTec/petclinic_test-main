package com.tecsup.petclinic.exceptions;

public class OwnersNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public OwnersNotFoundException(String message) {
        super(message);
    }
}
