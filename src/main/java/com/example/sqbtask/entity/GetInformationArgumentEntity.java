package com.example.sqbtask.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Map;

@ToString
@Setter
@Getter
@Entity
public class GetInformationArgumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String password;
    private String username;
    private long serviceId;

    @ElementCollection
    @CollectionTable(name = "paramKey_paramValue_mapping",
            joinColumns = {@JoinColumn(name = "paramId", referencedColumnName = "id")})
    @MapKeyColumn(name = "paramKey")
    @Column(name = "paramValue")
    private Map<String, String> parameters;

}
