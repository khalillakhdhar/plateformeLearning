package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.entity.users.Utilisateur;

@SpringBootApplication
public class PlateformeLearningApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PlateformeLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Utilisateur us=new Utilisateur();
		
		
	}

}
