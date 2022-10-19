package com.example.sqbtask.datatype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransactionStatement {
    private long amount;
    private long providerTrnId;
    private long transactionId;
    private LocalDateTime transactionTime;
}
