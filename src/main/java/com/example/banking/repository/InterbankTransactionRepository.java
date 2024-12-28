package com.example.banking.repository;

import com.example.banking.model.entity.InterbankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterbankTransactionRepository extends JpaRepository<InterbankTransaction, Long> {
    List<InterbankTransaction> findBySourceAccountId(Integer sourceAccountId);
}