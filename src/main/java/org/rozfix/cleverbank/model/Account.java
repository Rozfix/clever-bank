package org.rozfix.cleverbank.model;

import lombok.Getter;
import lombok.Setter;
import org.rozfix.cleverbank.util.generator.NumberGenerator;
import org.rozfix.cleverbank.util.generator.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Account {
    @Getter
    private final String accountId;
    @Getter
    @Setter
    private String accountNumber;
    @Getter
    @Setter
    private User accountOwner;
    @Getter
    @Setter
    private double balance;
    @Getter
    private List<Transaction> transactions;

    public Account(User accountOwner) {
        this.accountId = IdGenerator.generateId();
        this.accountOwner = accountOwner;
        this.accountNumber = NumberGenerator.generateAccountNumber();
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


}
