package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT m FROM Customer m where m.id= :customerId")
    Customer getCustomerById(@Param("customerId") Integer CustomerId);

}
