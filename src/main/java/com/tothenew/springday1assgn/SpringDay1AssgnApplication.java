package com.tothenew.springday1assgn;

import com.tothenew.springday1assgn.Ques3.SomeData;
import com.tothenew.springday1assgn.Ques5.Shape;
import com.tothenew.springday1assgn.Ques3.UsingComponent;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDay1AssgnApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDay1AssgnApplication.class, args);

        // Ques 3
        UsingComponent usingComponent = (UsingComponent) applicationContext.getBean(UsingComponent.class);
        usingComponent.printSomeData();

        // Ques 4
        for (String name: applicationContext.getBeanDefinitionNames()) {
            if (name.equals("showData"))
			System.out.println(name);
		}

        // Ques 5
        Shape shape = applicationContext.getBean(Shape.class);
        System.out.println(applicationContext.getBeansOfType(SomeData.class));
        shape.show();
    }

}
