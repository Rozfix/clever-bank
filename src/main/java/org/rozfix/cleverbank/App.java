package org.rozfix.cleverbank;

import org.rozfix.cleverbank.model.Account;

import org.rozfix.cleverbank.model.Bank;
import org.rozfix.cleverbank.model.User;
import org.rozfix.cleverbank.service.TransactionService;


public class App {
    public static void main(String[] args) {
        try {
            User egor = new User("Egor",
                    "Rozhkov",
                    "Sergeevich",
                    null);
            Bank clever = new Bank("Clever");
            clever.createAccount(egor);
            System.out.println(clever.getAccounts());
            Account account = new Account(egor);
            Account account1 = new Account(egor);
//            Account account = new Account();
//            TransactionService transactionService = new TransactionService();
//            transactionService.deposit(account, 200);
//            transactionService.withdraw(account, 60);
//
//            System.out.println(account.getBalance());
//            System.out.println(account.getTransactions());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
