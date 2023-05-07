package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="loan")
public class LoanController {
    @Autowired
    LoanService loanService;

    @RequestMapping(value="loanCreate", method = RequestMethod.POST)
    public void createLoan(){
        loanService.createLoan();
    }
}
