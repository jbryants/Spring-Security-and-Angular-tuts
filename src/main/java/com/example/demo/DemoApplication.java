package com.example.demo;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DemoApplication {
	
	@GetMapping("/user")
	@ResponseBody
	public Principal user(Principal user) {
		return user;
	}

	@GetMapping("/resource")
	@ResponseBody
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
