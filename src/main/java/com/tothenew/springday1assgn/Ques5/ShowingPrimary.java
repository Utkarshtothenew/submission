package com.tothenew.springday1assgn.Ques5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



class Rectangle implements Shape {

    @Override
    public void show() {
        System.out.println("I am a rectangle");
    }

}

class Circle implements Shape {

    @Override
    public void show() {
        System.out.println("I am a circle");
    }

}

@Configuration
public class ShowingPrimary {

        @Bean
        @Primary
        public Shape getRectangle() {
            return new Rectangle();
        }

        @Bean
        public Shape getCircle() {
            return new Circle();
        }

}
