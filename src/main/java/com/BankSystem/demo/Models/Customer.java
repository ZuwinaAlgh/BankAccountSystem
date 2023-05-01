package com.BankSystem.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    String CustomerName;
    Integer CustomerId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer CustomerPhoneNumber;


}
