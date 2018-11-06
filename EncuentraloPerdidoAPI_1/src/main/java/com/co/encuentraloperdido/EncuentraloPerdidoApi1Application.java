package com.co.encuentraloperdido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//para saber de donde ejecuta el controlador
@SpringBootApplication ( scanBasePackages  = { "com.co.encuentraloperdido" })
public class EncuentraloPerdidoApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(EncuentraloPerdidoApi1Application.class, args);
	}
}
