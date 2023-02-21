package com.example.demo.Model.repositories.education;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.education.Matiere;
import com.example.demo.Model.entity.users.Enseignant;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
public List<Matiere> findByEnseignant(Enseignant enseignant);
}
