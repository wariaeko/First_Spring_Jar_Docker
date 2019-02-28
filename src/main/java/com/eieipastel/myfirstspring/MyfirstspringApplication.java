package com.eieipastel.myfirstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstspringApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello() {
		return "Hello Docker";
	}
	
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name1", required = false, defaultValue = "Hello Wai") String name1) {
        return name1;
    }

}
