package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by T_GermanB1 on 22/06/2015.
 */
@EnableAutoConfiguration
@ComponentScan("com.test")
public class Application {

  public static void main(String args[]) {
    SpringApplication.run(Application.class, args);
  }

}
