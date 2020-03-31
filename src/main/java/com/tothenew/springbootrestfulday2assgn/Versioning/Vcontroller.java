package com.tothenew.springbootrestfulday2assgn.Versioning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Vcontroller {

    @Autowired
    private Service service;

    // uri based versioning
    @GetMapping("/v1/basic")
    public List<BasicUser> getAll() {
       return service.getAllBasicuser();
    }

    @GetMapping("/v2/detailed")
    public List<DetailedUser> getAllD() {
        return service.getAllDetaileduser();
    }

    // param based
    @GetMapping(value = "/basic", params = "version=1")
    public List<BasicUser> getAllParam() {
        return service.getAllBasicuser();
    }

    @GetMapping(value = "/detailed",params = "version=2")
    public List<DetailedUser> getAllParamD() {
        return service.getAllDetaileduser();
    }

    // header based
    @GetMapping(value = "/basich", headers = "version=1")
    public List<BasicUser> getAllheader() {
        return service.getAllBasicuser();
    }

    @GetMapping(value = "/detailedh",headers = "version=2")
    public List<DetailedUser> getAllheaderD() {
        return service.getAllDetaileduser();
    }

    // mime based
    @GetMapping(value = "/basicm", produces = "application/version1+json")
    public List<BasicUser> getAllProduces() {
        return service.getAllBasicuser();
    }

    @GetMapping(value = "/detailedm",produces = "application/version2+json")
    public List<DetailedUser> getAllProducesD() {
        return service.getAllDetaileduser();
    }
}
