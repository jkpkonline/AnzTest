package com.anz.test.controller;

import com.anz.test.model.AccountTransactionDetails;
import com.anz.test.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountTransactionController {


    @Autowired
    private TransactionService service;

    @GetMapping("/transactions/{accountNumber}")
    public ResponseEntity<List<AccountTransactionDetails>> accountList(@PathVariable int accountNumber) {
        return new ResponseEntity<List<AccountTransactionDetails>>
                (service.transactionList(accountNumber), HttpStatus.OK);
    }

}
