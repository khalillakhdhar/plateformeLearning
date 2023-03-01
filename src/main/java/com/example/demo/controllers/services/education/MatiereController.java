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

import com.example.demo.Model.entity.education.Matiere;

import jakarta.validation.Valid;

@RestController
@RequestMapping("matiere")
public class MatiereController {
@Autowired
MatiereService matiereService;
@GetMapping
public List<Matiere> findMatierees()
{
return matiereService.findAll();	
}
@PostMapping
public Matiere createOne(@Valid @RequestBody Matiere matiere)
{
return matiereService.CreateMatiere(matiere);	

}
@GetMapping("/{id}")
public Matiere findOne(@PathVariable long id)
{
return matiereService.findOneMatiere(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(long id)
{
matiereService.DeleteOne(id);	

}

}
