package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.Customer;
import com.BankSystem.demo.Repository.AccountRepository;
import com.BankSystem.demo.Repository.CustomerRepository;
import com.BankSystem.demo.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    TransactionRepository transactionRepository;



    public void createAccount(String AccountName, Integer CustomerId){                      //add customer
        Account account=new Account();
        account.setAccountName(AccountName);
        account.setAccountNumber(619835479);
        account.setCreatedDate(new Date());
        account.setUpdatedDate(new Date());
        account.setActive(Boolean.FALSE);
        account.setCustomer(customerRepository.getCustomerById(CustomerId));
        accountRepository.save(account);
    }

    public void createNewAccount(String AccountName, Integer CustomerId){                      //create New Account
        Account account=new Account();
        account.setAccountName(AccountName);
        account.setAccountNumber(926518746);
        account.setCreatedDate(new Date());
        account.setUpdatedDate(new Date());
        account.setActive(Boolean.TRUE);
        account.setCustomer(customerRepository.getCustomerById(CustomerId));
        accountRepository.save(account);
    }

    public Double getBalance(Integer id){                                             //Retrieve Account Balance
        Double account=accountRepository.getBalance(id);
        return account;
    }

    public List<Account> getAllAccounts() {                                             //get all Account
        return accountRepository.getAllAccount();

    }

    public void getCalculateInterest(Integer id) {                                     //Calculate the interest on the account balance
//        List<Account> accountList = accountRepository.getAllAccount();
            Account account=accountRepository.getAccountById(id);
            Double Balance = account.getBalance();
            Double InterestPercent = 0.15;
            account.setInterestAmount(InterestPercent);
            Double InterestAmount = Balance * InterestPercent;
            account.setBalance(Balance+InterestAmount);
            accountRepository.save(account);

    }
    }
