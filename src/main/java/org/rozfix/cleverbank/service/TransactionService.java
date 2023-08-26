package org.rozfix.cleverbank.service;
import lombok.Data;
import lombok.Setter;

import org.rozfix.cleverbank.model.Account;
import org.rozfix.cleverbank.model.Transaction;
import org.rozfix.cleverbank.util.IdGenerator;

import java.time.LocalDateTime;

public class TransactionService {

    public Transaction deposit(Account account, double amount) {
        Transaction transaction = new Transaction(
                IdGenerator.generateId(),
                LocalDateTime.now(),
                null,
                account,
                amount);
        account.setBalance(account.getBalance() + amount);
        account.addTransaction(transaction);

        return transaction;
    }

    public Transaction withdraw(Account account, double amount) {
        Transaction transaction = new Transaction(
                IdGenerator.generateId(),
                LocalDateTime.now(),
                null,
                account,
                amount
        );
        account.setBalance(account.getBalance() - amount);
        account.addTransaction(transaction);
        return transaction;
    }
}
