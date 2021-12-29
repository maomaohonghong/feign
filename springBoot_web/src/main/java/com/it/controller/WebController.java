package com.it.controller;

import com.it.api.ApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebController {

    @Autowired
    private ApiController apiController;

    @RequestMapping("/getList/{id}")
    public String getList(@PathVariable String id){
        return apiController.getList(id);
    }

}
