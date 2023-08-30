package org.rozfix.cleverbank.model;

import lombok.Data;
import lombok.Getter;
import lombok.SneakyThrows;
import org.rozfix.cleverbank.service.TransactionService;
import org.rozfix.cleverbank.util.generator.IdGenerator;

import java.util.HashMap;
import java.util.Map;

@Data
public class Bank {
    private final String bankId;
    private String bankName;
    @Getter
    private Map<String, Account> accounts;

    public Bank(String bankName) {
        this.bankId = IdGenerator.generateId();
        this.bankName = bankName;
        this.accounts = new HashMap<>();
    }

    public Account createAccount(User user) {
        Account newAccount = new Account(user);
        addAccount(newAccount);
        return newAccount;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }


}
