package com.tothenew.springbootrestfulday2assgn.Dynamicfilter.Services;

import com.tothenew.springbootrestfulday2assgn.Dynamicfilter.Model.SampleModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SampleModelServiceDynamic {
    private static List<SampleModel> sampleModelList = new ArrayList<>();

    public SampleModel addUser(SampleModel sampleModel) {
        sampleModelList.add(sampleModel);
        return sampleModel;
    }
}
