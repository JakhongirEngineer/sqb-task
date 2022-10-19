package com.example.sqbtask.datatype;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetInformationArgument extends GenericArgument{
    private List<GenericParam> parameters;
    private long serviceId;
}
