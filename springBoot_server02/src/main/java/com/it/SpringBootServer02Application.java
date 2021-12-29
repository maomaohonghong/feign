package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServer02Application.class,args);
    }

}
