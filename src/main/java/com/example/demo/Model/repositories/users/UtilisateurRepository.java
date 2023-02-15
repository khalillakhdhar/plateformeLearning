package com.example.demo.Model.repositories.users;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.users.Utilisateur;

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Long> {

}
