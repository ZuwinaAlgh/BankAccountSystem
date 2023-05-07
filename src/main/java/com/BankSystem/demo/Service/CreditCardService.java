package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.CreditCard;
import com.BankSystem.demo.Repository.CreditCardRepository;
import com.BankSystem.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.NavigableMap;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;
    @Autowired
    CustomerRepository customerRepository;

    public void createCreditCard(String Name, Integer CustomerId){                      //create account
        CreditCard creditCard=new CreditCard();
        creditCard.setName(Name);
        creditCard.setCreditCardNumber(4);
        creditCard.setOTP(865);
        creditCard.setCreatedDate(new Date());
        creditCard.setUpdatedDate(new Date());
        creditCard.setActive(Boolean.TRUE);
        creditCard.setCustomer(customerRepository.getCustomerById(CustomerId));
        creditCardRepository.save(creditCard);
    }
}
