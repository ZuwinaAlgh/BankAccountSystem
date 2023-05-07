package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query(value = "SELECT m FROM Account m where m.id= :id")
    Account getAccountById(@Param("id") Integer id);

    @Query(value="SELECT s.Balance from Account s where s.id = :id")
    Double getBalance(@Param("id") Integer id);



}
