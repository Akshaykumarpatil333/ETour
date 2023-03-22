package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static  main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
