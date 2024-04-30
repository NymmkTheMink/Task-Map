package com.example.taskmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class TaskMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskMapApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
