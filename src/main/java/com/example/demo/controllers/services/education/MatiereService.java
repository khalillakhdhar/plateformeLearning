package com.example.demo.controllers.services.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.entity.education.Matiere;
import com.example.demo.Model.repositories.education.MatiereRepository;
@Service
public class MatiereService implements matiereInterface{
@Autowired
private MatiereRepository matiereRepo;
	@Override
	public List<Matiere> findAll() {
		// TODO Auto-generated method stub
		return matiereRepo.findAll();
	}

	@Override
	public Matiere CreateMatiere(Matiere matiere) {
		// TODO Auto-generated method stub
		return matiereRepo.save(matiere);
	}

	@Override
	public Matiere findOneMatiere(long idMatiere) {
		// TODO Auto-generated method stub
		return matiereRepo.findById(idMatiere).get();
	}

	@Override
	public void DeleteOne(long idMatiere) {
		// TODO Auto-generated method stub
		matiereRepo.deleteById(idMatiere);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		matiereRepo.deleteAll();
	}

	
}
