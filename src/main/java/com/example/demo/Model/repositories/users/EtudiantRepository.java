package com.example.demo.Model.repositories.users;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.users.Etudiant;

public interface EtudiantRepository extends PagingAndSortingRepository<Etudiant, Long> {

}
