package com.sk.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.config.DatabaseConfiguration;

@RestController
public class CustomerController {

	@Autowired
	DatabaseConfiguration config;

	@Value("${spring.profile}")
	private String activeProfile;

	@GetMapping("/connection")
	public String getMessage() {

		if (activeProfile.equals("dev")) {
			DataSource dev = config.devDataSource();
			System.out.println("dev----> " + dev);
		} else if (activeProfile.equals("test")) {
			DataSource test = config.testDataSource();
			System.out.println("test----> " + test);
		} else if (activeProfile.equals("prod")) {
			DataSource prod = config.prodDataSource();
			System.out.println("prod----> " + prod);
		}
		return "Hi " + activeProfile;
	}

}
