package com.example.client.external;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ms-sample")
public interface MsSampleClient {
	
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String home();
}