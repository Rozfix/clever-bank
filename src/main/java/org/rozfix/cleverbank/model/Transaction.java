package org.rozfix.cleverbank.model;

import lombok.Data;
import org.rozfix.cleverbank.util.generator.IdGenerator;

import java.time.LocalDateTime;

@Data
public class Transaction {
    private final String transactionId;
    private LocalDateTime timestamp;
    private Account senderAccount;
    private Account recipientAccount;
    private double amount;

    public Transaction(Account sender, Account recipient, double amount) {
        this.transactionId = IdGenerator.generateId();
        this.timestamp  = LocalDateTime.now();
        this.senderAccount  = sender;
        this.recipientAccount  = recipient;
        this.amount  = amount;
    }
}
