package com.snl.springcloudconfigservier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class SpringCloudConfigServierApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServierApplication.class, args);
	}

}
