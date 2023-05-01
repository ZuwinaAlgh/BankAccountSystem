package com.BankSystem.demo.Models;

import javax.persistence.*;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer Amount;
    Integer InterestRate;
    @ManyToOne
    Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(Integer interestRate) {
        InterestRate = interestRate;
    }
}
