package com.tothenew.springbootrestfulday2assgn.Staticfiltering.Services;

import com.tothenew.springbootrestfulday2assgn.Staticfiltering.Model.SmapleModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SampleModelService {
    private static List<SmapleModel>  sampleModelList = new ArrayList<>();

    public SmapleModel addUser(SmapleModel sampleModel) {
        sampleModelList.add(sampleModel);
        return sampleModel;
    }
}
