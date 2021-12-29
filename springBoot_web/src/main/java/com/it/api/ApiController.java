package com.it.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-server")
public interface ApiController {

    @RequestMapping("/server/getList/{id}")
    public String getList(@PathVariable("id")  String id);

}
