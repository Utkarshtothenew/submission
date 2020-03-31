package com.tothenew.springday1assgn.Ques3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // means spring will auto-detect this class & make it available for dependency injection
public class UsingComponent {

    SomeData someData;

    // Ques 6
    @Autowired
    UsingComponent(SomeData someData) {
        this.someData = someData;
    }

    public void printSomeData () {
        someData.showData();
    }

}
