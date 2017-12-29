package org.xorg.openshiftrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.xorg.rest.controller")
public class OpenshiftRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftRestApplication.class, args);
	}
}