package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.Customer;
import com.BankSystem.demo.Repository.AccountRepository;
import com.BankSystem.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    CustomerRepository customerRepository;



    public void createAccount(String AccountName, Integer AccountNumber){                      //create account
        Account account=new Account();
        account.setAccountName(AccountName);
        account.setAccountNumber(AccountNumber);
        Customer customer = customerRepository.getCustomerById(account.getCustomer().getCustomerId());
        account.setCustomer(customer);
        accountRepository.save(account);
    }
}
