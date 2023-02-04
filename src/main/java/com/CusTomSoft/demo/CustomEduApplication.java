package com.CusTomSoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CusTomSoft.demo.CustomEduApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CustomEduApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomEduApplication.class, args);
	}

}
