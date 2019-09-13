package com.solstice.springcloudstreamexchangeconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
interface ExchangeBinding {

    @Input("exchangeChannel")
    SubscribableChannel exchange();
}
