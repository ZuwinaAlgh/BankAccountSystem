package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value="createCustomer", method = RequestMethod.POST)
    public void createCustomer(@RequestParam String CustomerName){
        customerService.CreateCustomer(CustomerName);
    }


    @RequestMapping(value="createNewCustomer", method = RequestMethod.POST)                         //create new customer
    public void createNewCustomer(){
        customerService.CreateNewCustomer();
    }
}
