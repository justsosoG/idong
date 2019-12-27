package org.njgzr;

import org.mybatis.spring.annotation.MapperScan;
import org.njgzr.security.config.EnableEasyShiro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEasyShiro
@MapperScan("org.njgzr.dao")
public class Idong2Application {

	public static void main(String[] args) {
		SpringApplication.run(Idong2Application.class, args);
	}

}
