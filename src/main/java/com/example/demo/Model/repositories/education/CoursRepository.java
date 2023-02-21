package com.example.demo.Model.repositories.education;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.Model.entity.education.Cours;
import com.example.demo.Model.entity.education.Matiere;

public interface CoursRepository extends JpaRepository<Cours, Long> {
public List<Cours> findByTitreLike(String titre);
public List<Cours> findByDescriptionLike(String description);
public List<Cours> findCoursByMatiere(Matiere matiere);
}
