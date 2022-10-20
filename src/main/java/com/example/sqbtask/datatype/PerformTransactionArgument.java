package com.example.sqbtask.datatype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PerformTransactionArgument extends GenericArgument {
    private long amount;
    private Map<String, String> parameters;
    private long serviceId;
    private long transactionId;
    private LocalDateTime transactionTime;
}
