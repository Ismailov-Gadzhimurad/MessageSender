package com.wamm.component_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@ServletComponentScan
@EnableJms
@EnableFeignClients
class Component2Application {

	public static void main(String[] args) {
		SpringApplication.run(Component2Application.class, args);
	}

}
