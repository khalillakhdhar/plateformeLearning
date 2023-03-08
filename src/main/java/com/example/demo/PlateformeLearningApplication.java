package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.entity.users.Utilisateur;
import com.example.demo.controllers.services.user.UtilisateurService;

@SpringBootApplication
public class PlateformeLearningApplication implements CommandLineRunner {
	//@Autowired
	//UtilisateurService usService;
	public static void main(String[] args) {
		SpringApplication.run(PlateformeLearningApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
/*
		
		Utilisateur us=new Utilisateur(0,"us1", "user1", "20111222", "Tunisie", "user1@gmail.com","userpass1", "user");
		Utilisateur us2=new Utilisateur(0,"us2", "user2", "20111233", "Tunisie", "user2@gmail.com","userpass2", "user2");
		
Utilisateur u1=		usService.CreateUser(us);
Utilisateur u2=		usService.CreateUser(us2);
u1.setAdresse("Gabés");
usService.CreateUser(u1);
usService.DeleteOne(u2.getId());
		usService.findAllUsers().forEach(u->
		{
			System.out.println(u.toString());
			
		}
				);
		
		
	
*/
	}
}
