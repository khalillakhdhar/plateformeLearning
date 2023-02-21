package com.example.demo.controllers.services.education;

import java.util.List;

import com.example.demo.Model.entity.education.Cours;

public interface CoursInterface {
public List<Cours> findCourses();
public List<Cours> findCoursesBytitre(String titre);
public List<Cours> findCoursesBydesc(String description);

public Cours findCoursById(long id);

public Cours CreateCours(Cours cours);
public void DeleteOneCours(long id);
public void DeleteCours();

}
