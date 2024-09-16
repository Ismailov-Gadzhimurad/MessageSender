package com.wamm.component_2.mqactive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;




@Component
public class ActiveMQConsumer {
    private static final Logger log = LoggerFactory.getLogger(ActiveMQConsumer.class);


    @Autowired
    private WhatsappApiClient whatsappApiClient;

    @JmsListener(destination = "new_queue")
    public void processMessage(String payload) {
        log.info("Received: " + payload);

        try {
            String response = whatsappApiClient.sendMessage(payload);
            log.info("Сообщение успешно отправлено на API!");
            log.info("Ответ: " + response);
        } catch (Exception e) {
            log.error("Ошибка при отправке сообщения на API: " + e.getMessage());
        }



    }
}