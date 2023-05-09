package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.CreditCard;
import com.BankSystem.demo.Service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="creditCard")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;

    @RequestMapping(value="createCreditCard", method = RequestMethod.POST)
    public void createCreditCard(@RequestParam String Name, Integer CustomerId){
    creditCardService.createCreditCard(Name,CustomerId);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)                                 //get All Account
    public List<CreditCard> getAllCreditCards(){
        List<CreditCard> creditCards= creditCardService.getAllCreditCards();
        return creditCards;
    }

}
