package com.anz.test.service;

import com.anz.test.entity.Account;
import com.anz.test.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public List<Account> accountList() {
        List<Account> accountList = new ArrayList<>();
        repository.findAll().forEach(v -> accountList.add(v));
        return accountList;
    }
}
