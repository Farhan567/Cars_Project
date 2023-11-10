package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.BankTransaction;

public interface BankTransactionRepo extends JpaRepository<BankTransaction, Long> {
	
    List<BankTransaction> findByToAccount(String toAccount);
}
