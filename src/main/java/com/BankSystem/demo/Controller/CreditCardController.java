package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="creditCard")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;

    @RequestMapping(value="createCreditCard", method = RequestMethod.POST)
    public void createCreditCard(@RequestParam String Name, Integer CustomerId){
    creditCardService.createCreditCard(Name,CustomerId);
    }

}
