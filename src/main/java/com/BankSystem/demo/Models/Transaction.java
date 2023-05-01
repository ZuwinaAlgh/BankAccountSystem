package com.BankSystem.demo.Models;

import javax.persistence.*;
import javax.xml.crypto.Data;
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // to genarate primary key
    Integer id;
    Integer Amount;
    Data date;
    @ManyToOne
    @JoinColumn(name="account-id", referencedColumnName = "id")
    Account account;

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

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }
}
