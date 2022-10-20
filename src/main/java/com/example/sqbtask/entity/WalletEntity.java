package com.example.sqbtask.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;

@ToString
@Setter
@Getter
@Entity
public class WalletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private long balance;
    @Column(nullable = false, length = 16, unique = true)
    private String walletNumber;

    @Column(nullable = false, unique = true)
    private String phone;


//    @ElementCollection
//    @CollectionTable(name = "paramKey_paramValue_mapping",
//            joinColumns = {@JoinColumn(name = "paramId", referencedColumnName = "id")})
//    @MapKeyColumn(name = "paramKey")
//    @Column(name = "paramValue")
//    private Map<String, String> parameters;

//    @Column(nullable = false)
//    private long serviceId;
//    @Column(nullable = false)
//    private long transactionId;
//    @Column(nullable = false)
//    private LocalDateTime transactionTime;

}
