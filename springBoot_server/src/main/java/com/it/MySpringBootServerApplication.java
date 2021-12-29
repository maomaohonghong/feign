package com.it;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MySpringBootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootServerApplication.class,args);
    }

}
