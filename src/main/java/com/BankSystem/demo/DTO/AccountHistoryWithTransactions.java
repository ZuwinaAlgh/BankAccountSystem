package com.BankSystem.demo.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Setter
@Getter
public class AccountHistoryWithTransactions {

    String customerName;
    String customerPhoneNumber;
    Integer age;
    String email;
    String accountName;
    Integer accountNumber;
    Double balance;
    Double interestAmount;
    Double transactionAmount;
    Double amount;

    public void accountHistoryWithAllTransactions(String CustomerName,String CustomerPhoneNumber,Integer age,String Email,String AccountName,Integer AccountNumber,Double Balance, Double InterestAmount,Double transactionAmount,Double amount){
        this.customerName= CustomerName;
        this.customerPhoneNumber=CustomerPhoneNumber;
        this.age=age;
        this.email=Email;
        this.accountName=AccountName;
        this.accountNumber=AccountNumber;
        this.balance=Balance;
        this.interestAmount=InterestAmount;
        this.transactionAmount=transactionAmount;
        this.amount=amount;
    }
}
