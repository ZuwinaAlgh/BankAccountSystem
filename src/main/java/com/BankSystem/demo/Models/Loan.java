package com.BankSystem.demo.Models;

import javax.persistence.*;

@Entity
public class Loan extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double Amount;
    Integer InterestRate;
    @ManyToOne
    @JoinColumn(name="Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Integer getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(Integer interestRate) {
        InterestRate = interestRate;
    }
}
