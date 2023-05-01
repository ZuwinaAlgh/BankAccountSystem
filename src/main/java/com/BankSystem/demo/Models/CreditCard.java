package com.BankSystem.demo.Models;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String Name;
    Integer CreditCardNumber;
    Integer OTP;
    @ManyToOne
    Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(Integer creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public Integer getOTP() {
        return OTP;
    }

    public void setOTP(Integer OTP) {
        this.OTP = OTP;
    }
}