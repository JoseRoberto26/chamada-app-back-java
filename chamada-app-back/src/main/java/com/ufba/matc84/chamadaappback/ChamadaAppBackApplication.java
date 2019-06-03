package com.ufba.matc84.chamadaappback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.ufba.matc84.chamadaappback.Repository"})
public class ChamadaAppBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChamadaAppBackApplication.class, args);
	}

}
