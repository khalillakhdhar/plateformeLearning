package com.example.demo.controllers.services.education;

import java.util.List;

import com.example.demo.Model.entity.education.Matiere;

public interface matiereInterface {
public List<Matiere>findAll();
public Matiere CreateMatiere(Matiere matiere);
public Matiere findOneMatiere(long idMatiere);
public void DeleteOne(long idMatiere);
public void deleteAll();

}
