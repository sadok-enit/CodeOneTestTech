package com.CodeOne.CatSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

/**
@EnableJpaRepositories("com.CodeOne.CatSearch.Service")
@EntityScan("com.CodeOne.CatSearch.Service")
@ComponentScan("com.CodeOne.CatSearch.Service")
**/
@SpringBootApplication
public class CatSearchApplication {

	//implements CommandLineRunner
	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(CatSearchApplication.class, args);
	
	}
	
}
