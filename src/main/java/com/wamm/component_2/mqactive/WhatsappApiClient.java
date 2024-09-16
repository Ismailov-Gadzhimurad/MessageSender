package com.wamm.component_2.mqactive;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "whatsappClient", url = "http://localhost:8087/whatsapp")
public interface WhatsappApiClient {

    @PostMapping(value = "/send", consumes = "application/json")
    String sendMessage(@RequestBody String payload);
}