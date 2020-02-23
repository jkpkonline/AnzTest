package com.anz.test.model;

import java.time.LocalDate;

public class AccountTransactionDetails {

    private int accountNumber;
    private String accountName;
    private LocalDate transactionDate;
    private String currencyType;
    private int amount;
    private String transactionType;
    private String transactionNarrative;

    public AccountTransactionDetails(int accountNumber, String accountName,
                 LocalDate transactionDate, String currencyType, int amount,
                 String transactionType, String transactionNarrative) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.transactionDate = transactionDate;
        this.currencyType = currencyType;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionNarrative = transactionNarrative;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }
}
