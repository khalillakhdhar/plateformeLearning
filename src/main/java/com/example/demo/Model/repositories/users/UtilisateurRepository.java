package com.example.demo.Model.repositories.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.users.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
public Utilisateur findByEmailAndPassword(String email,String password);
public Utilisateur findByGrade(String grade);
}
