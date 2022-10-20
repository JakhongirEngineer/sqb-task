package com.example.sqbtask.service;

import com.example.sqbtask.datatype.*;

public interface TransactionService {
    PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument);

    CheckTransactionResponse checkTransaction(CheckTransactionRequest checkTransactionRequest);

    CancelTransactionResponse cancelTransaction(CancelTransactionRequest cancelTransactionRequest);
}
