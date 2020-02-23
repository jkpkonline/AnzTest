package com.anz.test.controller;

import com.anz.test.entity.Account;
import com.anz.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("/accountList")
    public ResponseEntity<List<Account>> accountList() {
        return new ResponseEntity<List<Account>>(service.accountList(), HttpStatus.OK);
    }
}
