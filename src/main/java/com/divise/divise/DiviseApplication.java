package com.divise.divise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DiviseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiviseApplication.class, args);
	}

}
