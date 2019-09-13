package com.solstice.springcloudstreamexchangeproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(ExchangeBinding.class)
@SpringBootApplication
public class SpringCloudStreamExchangeProducerApplication implements CommandLineRunner {

    @Autowired
    ExchangeBinding exchangeBinding;


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamExchangeProducerApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        exchangeBinding.exchange().send(MessageBuilder.withPayload("Exchange ").build());
    }
}
