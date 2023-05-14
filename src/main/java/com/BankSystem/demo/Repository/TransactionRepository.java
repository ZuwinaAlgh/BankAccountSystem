package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.Loan;
import com.BankSystem.demo.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Query(value="SELECT s from Transaction s")                //get all Account
    List<Transaction> getAllTransaction();
}
