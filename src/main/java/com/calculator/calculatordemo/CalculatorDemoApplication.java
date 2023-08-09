package com.calculator.calculatordemo;

import com.calculator.calculatordemo.controller.CalculatorController;
import com.calculator.calculatordemo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CalculatorDemoApplication {

	@Autowired
	CalculatorController calculatorController;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println(calculatorController.hello());
			System.out.println("Sum:" + calculatorController.add(1,2));
			System.out.println("Difference:" + calculatorController.sub(3,2));
			System.out.println("Product:" + calculatorController.mul(1,2));
			System.out.println("Div:" + calculatorController.div(6,2));
		};
	}
}

