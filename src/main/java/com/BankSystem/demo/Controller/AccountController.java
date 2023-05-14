package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Service.AccountService;
import com.BankSystem.demo.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @Autowired
    TransactionService transactionService;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)                 //get All Account
    public List<Account> getAllAccount(){
        List<Account> accounts= accountService.getAllAccounts();
        return accounts;
    }
    @RequestMapping(value="createAccount", method = RequestMethod.POST)
    public void createAccount(@RequestParam String AccountName, Integer CustomerId )
    {accountService.createAccount(AccountName,CustomerId);
    }


    @RequestMapping(value="createNewAccount", method = RequestMethod.POST)
    public void createNewAccount(@RequestParam String AccountName, Integer CustomerId ){                          //create new Account
        accountService.createAccount(AccountName,CustomerId);
    }

    @RequestMapping(value = "getBalance", method = RequestMethod.GET)
    public Double getBalance(@RequestParam  Integer id){
        Double account=accountService.getBalance(id);
        return account;

    }

    @RequestMapping(value = "getAllAccount",method = RequestMethod.GET)                                 //get All Account
    public List<Account> getAllAccounts(){
        List<Account> accounts= accountService.getAllAccounts();
        return accounts;
    }

    @RequestMapping(value = "getInterestAmount", method = RequestMethod.GET)                            //Calculate the interest on the account balance
    public void calculateInterest(@RequestParam Integer id){
       accountService.getCalculateInterest(id);
    }





}
