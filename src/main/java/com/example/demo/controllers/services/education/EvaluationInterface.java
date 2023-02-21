package com.example.demo.controllers.services.education;

import java.util.List;

import com.example.demo.Model.entity.education.Evaluation;

public interface EvaluationInterface {
	public List<Evaluation>findAll();
	public Evaluation CreateEvaluation(Evaluation evaluation);
	public Evaluation findOneEvaluation(long idEvaluation);
	public void DeleteOne(long idEvaluation);
	public void deleteAll();
}
