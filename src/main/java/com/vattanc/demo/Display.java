package com.vattanc.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class Display {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    private  Vihicle vihicle = new Moto();
    public  Display(){}

    public Vihicle getVihicle() {
        return vihicle;
    }
@Autowired
    public Display(@Qualifier("moto") Vihicle vihicle) {
        this.vihicle = vihicle;
    }

    public void setVihicle(Vihicle vihicle) {
        this.vihicle = vihicle;
    }

    public Display(String test) {
        this.test = test;
    }

    public void showVihacle(){
        this.vihicle.dispaly();
    }
    @PostConstruct
    public void init(){
        System.out.println("bean is going to init..");

    }
    @PreDestroy
    public void destroy(){
        System.out.println("bean is going to destroy...");
    }
}
