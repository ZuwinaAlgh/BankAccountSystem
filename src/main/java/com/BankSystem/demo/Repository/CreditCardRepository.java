package com.BankSystem.demo.Repository;

import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
    @Query(value="SELECT s from CreditCard s")                //get all CreditCard
    List<CreditCard> getAllCreditCard();
}





