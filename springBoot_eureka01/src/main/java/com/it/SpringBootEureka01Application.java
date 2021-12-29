package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEureka01Application.class,args);
    }

}
