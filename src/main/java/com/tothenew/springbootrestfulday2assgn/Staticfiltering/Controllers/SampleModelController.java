package com.tothenew.springbootrestfulday2assgn.Staticfiltering.Controllers;

import com.tothenew.springbootrestfulday2assgn.Staticfiltering.Model.SmapleModel;
import com.tothenew.springbootrestfulday2assgn.Staticfiltering.Services.SampleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleModelController {

    @Autowired
    private SampleModelService sampleModelService;

    @PostMapping("/addUser")
    public SmapleModel addUser(@RequestBody SmapleModel smapleModel) {
        return sampleModelService.addUser(smapleModel);
    }

}
