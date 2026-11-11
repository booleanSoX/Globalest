package com.sebas.globalest.user.domain.model;

public record Email(String value) {
    public Email {
        if (value == null || !value.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            throw new IllegalArgumentException("El formato del correo electrónico no es válido.");
        }
    }
}
