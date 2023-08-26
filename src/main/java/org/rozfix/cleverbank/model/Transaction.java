package org.rozfix.cleverbank.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Transaction {
    private final String transactionId;
    private LocalDateTime timestamp;
    private Account senderAccount;
    private Account recipientAccount;
    private double amount;

    public Transaction(String transactionId, LocalDateTime timestamp, Account sender, Account recipient, double amount) {
        this.transactionId = transactionId;
        this.timestamp  = timestamp;
        this.senderAccount  = sender;
        this.recipientAccount  = recipient;
        this.amount  = amount;
    }
}
