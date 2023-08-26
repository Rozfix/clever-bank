package org.rozfix.cleverbank;

import org.rozfix.cleverbank.model.Account;

import org.rozfix.cleverbank.service.TransactionService;


public class App {
    public static void main(String[] args) {
        try {

            Account account = new Account();
            TransactionService transactionService = new TransactionService();
            transactionService.deposit(account, 100);
            transactionService.withdraw(account, 60);

            System.out.println(account.getBalance());
            System.out.println(account.getTransactions());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
