package com.sebas.globalest.user.domain.model;

import java.math.BigInteger;
import java.time.Instant;
import java.util.Objects;

public class User {
    final private BigInteger id;
    private String username;
    private String firstName;
    private String lastName;
    private String secondLastName;
    private Email email;
    private Password password;
    private Role role;
    private String rememberToken;
    private Instant createdOn;
    private Instant updatedOn;

    public User(BigInteger id, String username, String firstName,
                String lastName, String secondLastName, Email email,
                Password password, Role role, String rememberToken,
                Instant createdOn, Instant updatedOn) {

        if (id.equals(BigInteger.ZERO) || username.isEmpty()  ||
                firstName.isEmpty() ||
                lastName.isEmpty() ||
                role == null)
        {
            throw new IllegalArgumentException();
        }


        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.rememberToken = rememberToken;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public BigInteger getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(secondLastName, user.secondLastName) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && role == user.role && Objects.equals(rememberToken, user.rememberToken) && Objects.equals(createdOn, user.createdOn) && Objects.equals(updatedOn, user.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, secondLastName, email, password, role, rememberToken, createdOn, updatedOn);
    }
}
