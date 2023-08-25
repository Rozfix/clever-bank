package org.rozfix.cleverbank.model;

import lombok.Data;
import java.util.List;

@Data
public class Bank {
    private String bankName;
    private List<Account> accounts;
}
