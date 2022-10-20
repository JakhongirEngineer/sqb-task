package com.example.sqbtask.service;

import com.example.sqbtask.datatype.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface TransactionService {
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument);
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    CheckTransactionResponse checkTransaction(CheckTransactionRequest checkTransactionRequest);
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    CancelTransactionResponse cancelTransaction(CancelTransactionRequest cancelTransactionRequest);
}
