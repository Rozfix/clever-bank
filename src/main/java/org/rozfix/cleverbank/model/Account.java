package org.rozfix.cleverbank.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.rozfix.cleverbank.util.IdGenerator;

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
    private double balance;
    @Getter
    private List<Transaction> transactions;

    public Account() {
        this.accountId = IdGenerator.generateId();
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


}
