package com.example.sqbtask.datatype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestParamDescriptor {
    private long svrId;
    private String name;
    private String type;
    private String validator;
    private int length;
    private String captionUz;
    private String captionRu;
    private boolean required;
    private boolean visible;
    private int order;
}
