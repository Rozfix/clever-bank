package org.rozfix.cleverbank.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Transaction {
    private final int transactionId;
    private LocalDateTime timestamp;
    private Account senderAccount;
    private Account recipientAccount;
    private double amount;

    public Transaction(int transactionId) {
        this.transactionId = transactionId;
    }
}
