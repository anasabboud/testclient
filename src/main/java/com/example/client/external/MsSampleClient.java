package com.example.client.external;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ms-sample", fallback = MsSampleFallback.class)
public interface MsSampleClient {
	
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String home();

    @RequestMapping(method = RequestMethod.GET, value = "/sendToKafka/{topic}/{message}")
    String sendToKafka(@PathVariable("topic") final String topic, @PathVariable("message") final String message);

}