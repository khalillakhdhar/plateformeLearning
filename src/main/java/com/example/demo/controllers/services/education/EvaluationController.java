package com.example.demo.controllers.services.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.entity.education.Evaluation;

import jakarta.validation.Valid;
@CrossOrigin

@RestController
@RequestMapping("evaluation")
public class EvaluationController {

	@Autowired
	EvaluationService evaluationService;
	@GetMapping
	public List<Evaluation> findEvaluationes()
	{
	return evaluationService.findAll();	
	}
	@PostMapping
	public Evaluation createOne(@Valid @RequestBody Evaluation evaluation)
	{
	return evaluationService.CreateEvaluation(evaluation);	

	}
	@GetMapping("/{id}")
	public Evaluation findOne(@PathVariable long id)
	{
	return evaluationService.findOneEvaluation(id);	
	}
	@DeleteMapping("/{id}")
	public void deleteOne(long id)
	{
	evaluationService.DeleteOne(id);	

	}
	
	
}
