package com.example.demo.Model.repositories.users;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.users.Enseignant;

public interface EnseignantRepository extends PagingAndSortingRepository<Enseignant, Long> {

}
