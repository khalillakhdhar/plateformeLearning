package com.example.demo.controllers.services.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.entity.education.Evaluation;
import com.example.demo.Model.repositories.education.EvaluationRepository;
@Service
public class EvaluationService implements EvaluationInterface {
	@Autowired
	private EvaluationRepository evaluationRepo;
		@Override
		public List<Evaluation> findAll() {
			// TODO Auto-generated method stub
			return evaluationRepo.findAll();
		}

		@Override
		public Evaluation CreateEvaluation(Evaluation evaluation) {
			// TODO Auto-generated method stub
			return evaluationRepo.save(evaluation);
		}

		@Override
		public Evaluation findOneEvaluation(long idEvaluation) {
			// TODO Auto-generated method stub
			return evaluationRepo.findById(idEvaluation).get();
		}

		@Override
		public void DeleteOne(long idEvaluation) {
			// TODO Auto-generated method stub
			evaluationRepo.deleteById(idEvaluation);
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			evaluationRepo.deleteAll();
		}

}
