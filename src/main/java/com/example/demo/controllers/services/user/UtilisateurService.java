package com.example.demo.controllers.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.entity.users.Utilisateur;
import com.example.demo.Model.repositories.users.UtilisateurRepository;

@Service
public class UtilisateurService implements UtilisateurInterface {

	@Autowired
	UtilisateurRepository userRepo;
	
	
	@Override
	public List<Utilisateur> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Utilisateur CreateUser(Utilisateur user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public Utilisateur findOneUser(long idUser) {
		// TODO Auto-generated method stub
		return userRepo.findById(idUser).get();
	}

	@Override
	public void DeleteOne(long idUser) {
		// TODO Auto-generated method stub
		userRepo.deleteById(idUser);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
userRepo.deleteAll();
	}

	@Override
	public Utilisateur authentification(String email, String password) {
		// TODO Auto-generated method stub
		return userRepo.findByEmailAndPassword(email, password);
	}

}
