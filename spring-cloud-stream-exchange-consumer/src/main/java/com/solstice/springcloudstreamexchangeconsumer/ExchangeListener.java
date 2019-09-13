package com.solstice.springcloudstreamexchangeconsumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(ExchangeBinding.class)
public class ExchangeListener {

    @StreamListener(target = "exchangeChannel")
    public void exchangeListener(String message)
    {
        System.out.println(message);
    }
}
