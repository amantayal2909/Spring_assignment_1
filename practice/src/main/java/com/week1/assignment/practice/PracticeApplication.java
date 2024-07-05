package com.week1.assignment.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

	@Autowired
	CakeBaker c;
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ALICE BAKERY");
		c.bakecake();
	}
}
