package com.BankSystem.demo.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Entity
public class Account extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String AccountName;
   Integer AccountNumber;

   Double Balance;
   Double InterestAmount;
   Double transactionAmount;

   Double amount;



    @ManyToOne
    @JoinColumn(name = "Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;


}
