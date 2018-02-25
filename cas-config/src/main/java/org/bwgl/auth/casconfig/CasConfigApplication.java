package org.bwgl.auth.casconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CasConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasConfigApplication.class, args);
	}
}
