package org.rozfix.cleverbank.model;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private final int userId;
    private String firstName;
    private String lastName;
    private String surname;
    private List<Account> accounts;

    public User(int userId) {
        this.userId = userId;
    }
}
