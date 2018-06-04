package com.vattanc.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
    public  Moto moto(){
      return new Moto();
  }
  @Bean
    public Bike bike(){
      return new Bike();
  }

}
