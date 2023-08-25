package org.rozfix.cleverbank.model;

import lombok.Data;
@Data
public class Account {
    private final int accountId;
    private String accountNumber;
    private double balance;

    public Account(int accountId) {
        this.accountId = accountId;
    }
}
