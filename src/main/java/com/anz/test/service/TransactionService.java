package com.anz.test.service;

import com.anz.test.model.AccountTransactionDetails;
import com.anz.test.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private AccountTransactionRepository repository;

    public List<AccountTransactionDetails> transactionList(int accountNumber) {
        List<AccountTransactionDetails> transactionDetailsList =
                repository.transactionDetailList(accountNumber);
        return transactionDetailsList;
    }
}
