package com.example.demo.Model.repositories.education;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.education.Cours;
import com.example.demo.Model.entity.education.Evaluation;
import com.example.demo.Model.entity.users.Utilisateur;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
public List<Evaluation> findEvaluationByUtilisateur(Utilisateur utilisateur);
public List<Evaluation> findEvaluationByCours(Cours cours);

}

