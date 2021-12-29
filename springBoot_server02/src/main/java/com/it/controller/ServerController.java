package com.it.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    @RequestMapping("/getList/{id}")
    public String getList(@PathVariable("id") String id){
        return "调通了02"+id;
    }

}
