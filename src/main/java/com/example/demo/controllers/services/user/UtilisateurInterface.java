package com.example.demo.controllers.services.user;

import java.util.List;

import com.example.demo.Model.entity.users.Utilisateur;

public interface UtilisateurInterface {
public List<Utilisateur> findAllUsers();
public Utilisateur CreateUser(Utilisateur user);
public Utilisateur findOneUser(long idUser);
public void DeleteOne(long idUser);
public void deleteAll();
public Utilisateur authentification(String email,String password);

}
