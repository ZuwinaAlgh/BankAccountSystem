package com.BankSystem.demo.Service;

import com.BankSystem.demo.Models.Customer;
import com.BankSystem.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void CreateCustomer(String CustomerName){
        Customer customer=new Customer();
        customer.setCustomerName(CustomerName);
        customer.setCustomerPhoneNumber("24569832");
        customer.setAge(25);
        customer.setEmail("aaa@hotmail.com");
        customerRepository.save(customer);
    }
}
