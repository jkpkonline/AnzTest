package com.anz.test.repository;

import com.anz.test.entity.Transaction;
import com.anz.test.model.AccountTransactionDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends CrudRepository<Transaction, Integer> {

    List<Transaction> findByAccountNumber(int accountNumber);

    @Query("select new com.anz.test.model.AccountTransactionDetails( ac.accountNumber, ac.accountName, tc.transactionDate," +
            " ac.currencyType, tc.amount, tc.transactionType, tc.transactionNarrative) from " +
            " Account ac, Transaction tc where ac.accountNumber = tc.accountNumber and tc.accountNumber = ?1")
    List<AccountTransactionDetails> transactionDetailList(int accountNumber);
}
