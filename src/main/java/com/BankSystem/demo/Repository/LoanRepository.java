package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Customer;
import com.BankSystem.demo.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}
