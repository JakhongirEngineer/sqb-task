package com.example.sqbtask.controller;


import com.example.sqbtask.datatype.PerformTransactionArgument;
import com.example.sqbtask.datatype.PerformTransactionResult;
import lombok.experimental.UtilityClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TransactionController.TransactionEndpoints.BASE_URL)
public class TransactionController {

    //TODO
    public PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument) {
        return null;
    }

    //TODO: not enough description for input and output
    public void checkTransaction() {

    }

    //TODO: not enough description for input and output
    public void cancelTransaction() {

    }

    @UtilityClass
    public static class TransactionEndpoints {
        public static final String BASE_URL = "/api/v1/transaction";
    }
}
