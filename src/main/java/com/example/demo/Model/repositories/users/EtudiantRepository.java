package com.example.demo.Model.repositories.users;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.education.Cours;
import com.example.demo.Model.entity.users.Etudiant;

public interface EtudiantRepository extends PagingAndSortingRepository<Etudiant, Long> {
}
