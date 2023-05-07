package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Customer;
import com.BankSystem.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void CreateCustomer(String CustomerName){
        Customer customer=new Customer();
        customer.setCustomerName(CustomerName);
        customer.setCustomerPhoneNumber("96874532");
        customer.setAge(35);
        customer.setEmail("Raham@hotmail.com");
        customer.setCreatedDate(new Date());
        customer.setUpdatedDate(new Date());
        customer.setActive(Boolean.TRUE);
        customerRepository.save(customer);
    }


}
