package com.example.sqbtask.controller;

import com.example.sqbtask.datatype.*;
import com.example.sqbtask.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;


@RequiredArgsConstructor
@RestController
@RequestMapping(TransactionController.TransactionEndpoints.BASE_URL)
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping(TransactionEndpoints.PERFORM_TRANSACTION)
    public PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument) {
        return transactionService.performTransaction(performTransactionArgument);
    }

    @PostMapping(TransactionEndpoints.CHECK_TRANSACTION)
    public CheckTransactionResponse checkTransaction(CheckTransactionRequest checkTransactionRequest) {
        return transactionService.checkTransaction(checkTransactionRequest);
    }

    @PostMapping(TransactionEndpoints.CANCEL_TRANSACTION)
    public CancelTransactionResponse cancelTransaction(CancelTransactionRequest cancelTransactionRequest) {
        return transactionService.cancelTransaction(cancelTransactionRequest);
    }

    @UtilityClass
    public static class TransactionEndpoints {
        public static final String BASE_URL = "/api/v1/transaction";
        public static final String PERFORM_TRANSACTION = "";
        public static final String CHECK_TRANSACTION = "/check";
        public static final String CANCEL_TRANSACTION = "/cancel";
    }
}