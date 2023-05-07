package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.Loan;
import com.BankSystem.demo.Repository.CustomerRepository;
import com.BankSystem.demo.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LoanService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    LoanRepository loanRepository;

    public void createLoan(){                      //create Loan
        Loan loan=new Loan();
        loan.setAmount(300.50);
        loan.setInterestRate(14);
        loan.setCreatedDate(new Date());
        loan.setUpdatedDate(new Date());
        loan.setActive(Boolean.TRUE);
        loan.setCustomer(customerRepository.getCustomerById(8));
        loanRepository.save(loan);
    }
}
