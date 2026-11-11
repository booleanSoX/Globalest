package com.sebas.globalest.user.domain.model;

public record Password(String value) {
    public Password {
        if (value == null || value.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }
        // Aquí podrías añadir más reglas: regex de mayúsculas, números, etc.
    }
}
