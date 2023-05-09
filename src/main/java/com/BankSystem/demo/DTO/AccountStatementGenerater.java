package com.BankSystem.demo.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class AccountStatementGenerater{
    String customerName;
    String customerPhoneNumber;
    String accountName;
    Integer accountNumber;
    Double balance;


    public AccountStatementGenerater(String customerName, String customerPhoneNumber, String accountName,Integer accountNumber,Double balance) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.accountName = accountName;
        this.accountNumber= accountNumber;
        this.balance=balance;

    }

}
