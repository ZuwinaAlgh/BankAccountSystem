package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Models.Transaction;
import com.BankSystem.demo.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @RequestMapping(value="transactionCreate", method = RequestMethod.POST)
    public void createTransaction(){
        transactionService.createTransaction();
    }

    @RequestMapping(value="getAllTransaction", method =RequestMethod.GET)
    public List<Transaction> getAllTransaction(){
        List<Transaction> transactions=transactionService.getAllTransaction();
        return  transactions;
}
}
