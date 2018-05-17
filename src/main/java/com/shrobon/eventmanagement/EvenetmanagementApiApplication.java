package com.shrobon.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication(scanBasePackages = {"eventmanagement"},exclude =JpaRepositoriesAutoConfiguration.class)
@EntityScan(basePackageClasses={EvenetmanagementApiApplication.class,Jsr310Converters.class})
public class EvenetmanagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvenetmanagementApiApplication.class, args);
	}
}
