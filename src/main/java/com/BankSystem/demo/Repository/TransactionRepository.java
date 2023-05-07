package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Loan;
import com.BankSystem.demo.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
