package com.example.sqbtask.controller;

import com.example.sqbtask.datatype.*;
import com.example.sqbtask.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping(TransactionController.TransactionEndpoints.BASE_URL)
public class TransactionController {

    private final TransactionService transactionService;

    public PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument) {
        return transactionService.performTransaction(performTransactionArgument);
    }

    //TODO: not enough description for input and output
    public CheckTransactionResponse checkTransaction(CheckTransactionRequest checkTransactionRequest) {
        return transactionService.checkTransaction(checkTransactionRequest);
    }

    public CancelTransactionResponse cancelTransaction(CancelTransactionRequest cancelTransactionRequest) {
        return transactionService.cancelTransaction(cancelTransactionRequest);
    }

    @UtilityClass
    public static class TransactionEndpoints {
        public static final String BASE_URL = "/api/v1/transaction";
    }
}
