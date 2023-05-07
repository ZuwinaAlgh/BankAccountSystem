package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
}
