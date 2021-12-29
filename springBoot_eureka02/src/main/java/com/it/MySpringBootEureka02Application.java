package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MySpringBootEureka02Application {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootEureka02Application.class,args);
    }
}
