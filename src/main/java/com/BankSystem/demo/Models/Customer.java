package com.BankSystem.demo.Models;

import javax.persistence.*;

@Entity
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer CustomerId;
    @Column(name="Customer_name")
    String CustomerName;
    String CustomerPhoneNumber;
    Integer age;
    String Email;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
