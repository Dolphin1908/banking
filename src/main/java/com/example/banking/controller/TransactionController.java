package com.example.banking.controller;


import com.example.banking.repository.InterbankTransactionRepository;
import com.example.banking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired
    private final TransactionRepository transactionRepository;

    @Autowired
    private final InterbankTransactionRepository interbankTransactionRepository;

    // Constructor
    public TransactionController(TransactionRepository transactionRepository, InterbankTransactionRepository interbankTransactionRepository) {
        this.transactionRepository = transactionRepository;
        this.interbankTransactionRepository = interbankTransactionRepository;
    }

    @GetMapping("")
    public Object getTransactionBySourceId(@RequestParam Integer userId, @RequestParam(required = false, defaultValue = "") String type) {
        if (type.isEmpty()) {
            return transactionRepository.findBySourceAccountId(userId);
        } else if (type.equalsIgnoreCase("interbank")) {
            return interbankTransactionRepository.findBySourceAccountId(userId);
        } else {
            // Trả về lỗi nếu type không hợp lệ
            throw new IllegalArgumentException("Invalid transaction type: " + type);
        }
    }
}
