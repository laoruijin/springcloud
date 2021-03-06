package com.eureka.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaServerApplication.class);
		app.addListeners(new ApplicationPidFileWriter());
		app.run(args);
		//SpringApplication.run(EurekaServerApplication.class, args);
	}
}
