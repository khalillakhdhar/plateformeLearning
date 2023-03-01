package com.example.demo.controllers.services.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.entity.education.Cours;

import jakarta.validation.Valid;

@RestController
@RequestMapping("cours")
public class CoursController {
@Autowired 
CoursService coursService;
@GetMapping
public List<Cours> findCourses()
{
return coursService.findCourses();	
}
@PostMapping
public Cours createOne(@Valid @RequestBody Cours cours)
{
return coursService.CreateCours(cours);	

}
@GetMapping("/{id}")
public Cours findOne(@PathVariable long id)
{
return coursService.findCoursById(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(long id)
{
coursService.DeleteOneCours(id);	

}
}
