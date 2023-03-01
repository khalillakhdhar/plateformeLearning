package com.example.demo.controllers.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.entity.users.Utilisateur;

import jakarta.validation.Valid;

@RestController
@RequestMapping("utilisateur")
public class UtilisateurController {
@Autowired
UtilisateurService utilisateurService;
@GetMapping
public List<Utilisateur> findUsers()
{
return utilisateurService.findAllUsers();	

}
@GetMapping("/{id}")
public Utilisateur findOneUser(@PathVariable Long id)
{
return utilisateurService.findOneUser(id);	
}
@PostMapping
public Utilisateur addOne( @Valid @RequestBody Utilisateur user)
{
return utilisateurService.CreateUser(user);	

}
@DeleteMapping("/{id}")
public void deleteUser(@PathVariable long id)
{
utilisateurService.DeleteOne(id);	
}
}
