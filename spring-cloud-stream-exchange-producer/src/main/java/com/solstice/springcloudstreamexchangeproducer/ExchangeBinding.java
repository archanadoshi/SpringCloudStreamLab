package com.solstice.springcloudstreamexchangeproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
interface ExchangeBinding {

    @Output("exchangeChannel")
    MessageChannel exchange();
}
