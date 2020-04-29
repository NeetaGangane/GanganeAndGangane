package com.gangane.construction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.gangane.construction"})
@SpringBootApplication
public class GanganeConstructionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GanganeConstructionApplication.class, args);
	}

}
