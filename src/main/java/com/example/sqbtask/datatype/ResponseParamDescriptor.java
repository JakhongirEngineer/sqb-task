package com.example.sqbtask.datatype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseParamDescriptor {
    private long svrId;
    private String name;
    private String type;
    private String captionUz;
    private String captionRu;
}
