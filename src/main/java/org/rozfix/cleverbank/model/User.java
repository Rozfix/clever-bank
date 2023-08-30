package org.rozfix.cleverbank.model;

import lombok.Data;
import org.rozfix.cleverbank.util.generator.IdGenerator;

import java.util.List;

@Data
public class User {
    private final String userId;
    private String firstName;
    private String lastName;
    private String surname;
    private List<Account> accounts;

    public User( String firstName, String lastName, String surname, List<Account> accounts) {
        this.userId = IdGenerator.generateId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.accounts = accounts;
    }
}
