package com.vattanc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Display display = context.getBean("display", Display.class);
        display.showVihacle();
        display.setTest("This is first");

        Display display2 = context.getBean("display", Display.class);
        display2.showVihacle();
        display2.setTest("This is second");

        System.out.println(display.getTest());
        System.out.println(display.getTest());


        ((ConfigurableApplicationContext) context).close();
    }

}
