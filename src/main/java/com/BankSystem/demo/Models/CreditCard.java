package com.BankSystem.demo.Models;

import javax.persistence.*;

@Entity
public class CreditCard extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String Name;
    Integer CreditCardNumber;
    Integer OTP;
    @ManyToOne
    @JoinColumn(name="Customer_Id", referencedColumnName = "CustomerId")
    Customer customer;
    @OneToOne
    @JoinColumn(name="id", referencedColumnName = "id")
    Account account;

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
