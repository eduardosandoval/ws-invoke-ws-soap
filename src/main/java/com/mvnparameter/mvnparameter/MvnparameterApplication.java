package com.mvnparameter.mvnparameter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.mvnparameter.controller,com.mvnparameter.service,com.mvnparameter.Impl"})

@SpringBootApplication
public class MvnparameterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvnparameterApplication.class, args);
	}

}
