package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Loan;
import com.BankSystem.demo.Models.Transaction;
import com.BankSystem.demo.Repository.AccountRepository;
import com.BankSystem.demo.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    AccountRepository accountRepository;

    public void createTransaction(){                      //create Transaction
        Transaction transaction=new Transaction();
        transaction.setAmount(95);
        transaction.setCreatedDate(new Date());
        transaction.setUpdatedDate(new Date());
        transaction.setActive(Boolean.TRUE);
        transaction.setAccount(accountRepository.getAccountById(7));
        transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransaction(){
        return transactionRepository.getAllTransaction();

    }
}
