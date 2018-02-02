package com.example.client.external;

import org.springframework.stereotype.Component;

@Component
public class MsSampleFallback implements MsSampleClient {

    @Override
    public String home() {
        return "Hello fallback (Service unavailable)";
    }

    @Override
    public String sendToKafka(final String topic, final String message) {
        return("Fallback (Service unavailable)");
    }
}
