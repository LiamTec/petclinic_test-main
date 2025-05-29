package com.tecsup.petclinic.exceptions;

public class OwnersNotFoundException extends RuntimeException {
    public OwnersNotFoundException(String message) {
        super(message);
    }
}
