package com.zn.hrconnect.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.gw.hrconnect.controller, com.zn.hrconnect.domain.repository,"
		+ " com.zn.hrconnect.service.api" })
@EnableJpaRepositories("com.zn.hrconnect.domain.repository")
@EntityScan("com.zn.hrconnect.domain.entity")
@ComponentScan(basePackages = "com.zn.hrconnect,com.zn.hrconnect.service,com.gw.hrconnect.controller")
@Configuration("com.zn.hrconnect.domain.repository")


public class HrConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrConnectApplication.class, args);
	}

}
