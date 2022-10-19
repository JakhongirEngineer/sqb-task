package com.example.sqbtask.controller;


import com.example.sqbtask.datatype.GetInformationArgument;
import com.example.sqbtask.datatype.GetInformationResult;
import lombok.experimental.UtilityClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(InformationController.InformationEndpoints.BASE_PATH)
public class InformationController {


    //TODO
    public GetInformationResult getInformation(GetInformationArgument getInformationArgument) {
        return null;
    }

    //TODO: not enough description for input and output
    public void getStatement() {}

    @UtilityClass
    protected static class InformationEndpoints {
        public static final String BASE_PATH = "/api/v1/information";
    }
}
