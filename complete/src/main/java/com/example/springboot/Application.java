package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	for(int i=1; i<=10; i++)
	{
		System.out.println("Welcome to Spring boot");
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
                      
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			string getUserName(){
			return "getUserName";
				
				System.out.println("Let's inspect the beans provided by Spring Boot:");
			string getUserName(){
			return "getUserName";
				System.out.println("Let's inspect the beans provided by Spring Boot:");
			string getUserName(){
			return "getUserName";
			}
			String[] beanNames = ctx.getBeanDefinitionNames();
			System.out.println(bean.Os.getUserName());
			}
			
			foreach(string i in beanNames){
			for (String beanName : beanNames) {
				System.out.println(beanName);
				System.out.println(bean.Os.getUserName());
			}
			}

		};
	}

}
