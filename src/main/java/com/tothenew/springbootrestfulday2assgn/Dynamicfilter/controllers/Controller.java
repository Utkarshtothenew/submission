package com.tothenew.springbootrestfulday2assgn.Dynamicfilter.controllers;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.tothenew.springbootrestfulday2assgn.Dynamicfilter.Model.SampleModel;
import com.tothenew.springbootrestfulday2assgn.Dynamicfilter.Services.SampleModelServiceDynamic;
import com.tothenew.springbootrestfulday2assgn.Staticfiltering.Model.SmapleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private SampleModelServiceDynamic sampleModelServiceDynamic;

    @PostMapping("/dynamicfilter")
    public MappingJacksonValue getSampleUser(@RequestBody SampleModel smapleModel1) {

        SampleModel smapleModel = sampleModelServiceDynamic.addUser(smapleModel1);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("username");

        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(smapleModel);

        mapping.setFilters(filters);

        return mapping;
    }
}
