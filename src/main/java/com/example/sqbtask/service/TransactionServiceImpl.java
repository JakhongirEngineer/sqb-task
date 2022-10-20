package com.example.sqbtask.service;

import com.example.sqbtask.datatype.*;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl implements TransactionService{

    /**
     * @param performTransactionArgument
     * @return
     */
    @Override
    public PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument) {
        return null;
    }

    /**
     * @param checkTransactionRequest
     * @return
     */
    @Override
    public CheckTransactionResponse checkTransaction(CheckTransactionRequest checkTransactionRequest) {
        return null; // Not implemented
    }

    /**
     * @param cancelTransactionRequest
     * @return
     */
    @Override
    public CancelTransactionResponse cancelTransaction(CancelTransactionRequest cancelTransactionRequest) {
        return null; // Not implemented
    }
}
