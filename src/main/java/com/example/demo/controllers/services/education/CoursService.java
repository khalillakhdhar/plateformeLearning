package com.example.demo.controllers.services.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.entity.education.Cours;
import com.example.demo.Model.repositories.education.CoursRepository;
@Service
public class CoursService implements CoursInterface {
@Autowired
private CoursRepository coursRepo; 
 
	
	
	@Override
	public List<Cours> findCourses() {
		// TODO Auto-generated method stub
		return coursRepo.findAll();
	}

	@Override
	public List<Cours> findCoursesBytitre(String titre) {
		// TODO Auto-generated method stub
		return coursRepo.findByTitreLike(titre);
	}

	@Override
	public List<Cours> findCoursesBydesc(String description) {
		// TODO Auto-generated method stub
		return coursRepo.findByDescriptionLike(description);
	}

	@Override
	public Cours findCoursById(long id) {
		// TODO Auto-generated method stub
		return coursRepo.findById(id).get();
	}

	@Override
	public Cours CreateCours(Cours cours) {
		// TODO Auto-generated method stub
		return coursRepo.save(cours);
	}

	@Override
	public void DeleteOneCours(long id) {
		// TODO Auto-generated method stub
		coursRepo.deleteById(id);
	}

	@Override
	public void DeleteCours() {
		// TODO Auto-generated method stub
		coursRepo.deleteAll	();
	}
	

}
