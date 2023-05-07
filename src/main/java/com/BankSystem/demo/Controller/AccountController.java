package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value="createAccount", method = RequestMethod.POST)
    public void createAccount(@RequestParam String AccountName, Integer CustomerId ){accountService.createAccount(AccountName,CustomerId);
    }



}
