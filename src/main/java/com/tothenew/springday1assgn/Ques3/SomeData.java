package com.tothenew.springday1assgn.Ques3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // tells spring that this class has @Bean annotation method
public class SomeData {

    @Bean
    public void showData() {
        System.out.println("Hi Spring");
    }
}
