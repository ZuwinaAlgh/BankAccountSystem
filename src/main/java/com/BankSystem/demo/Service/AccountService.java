package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.Customer;
import com.BankSystem.demo.Repository.AccountRepository;
import com.BankSystem.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CustomerRepository customerRepository;



    public void createAccount(String AccountName, Integer CustomerId){                      //create account
        Account account=new Account();
        account.setAccountName(AccountName);
        account.setAccountNumber(619835479);
        account.setCreatedDate(new Date());
        account.setUpdatedDate(new Date());
        account.setActive(Boolean.FALSE);
        account.setCustomer(customerRepository.getCustomerById(CustomerId));
        accountRepository.save(account);
    }
}
